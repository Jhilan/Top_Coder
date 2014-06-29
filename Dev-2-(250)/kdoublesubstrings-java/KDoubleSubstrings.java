

public class KDoubleSubstrings {

	public static int howMuch(String[] str, int k) {

	String all="";
	int ans=0;
	for(String x: str){
	all+=x;
	}
	int len = all.length();
	for(int i=0; i<len; i++){
	for(int j=i; j<=len; j++){

	String sub=all.substring(i,j);
	if( (sub.length() % 2 == 0) && (i != j )){        
	if(check(sub,k) == true  ) ans++;
	}
	}
	}
	return ans;
	}

	public static boolean check(String s , int n){
	int len = s.length(), count=0;

	int L = len/2;
	for(int i=0;i <L; i++){
	if(s.charAt(i) != s.charAt(i+L)) count++;
	}
	if(count <= n ){return true;}

	return false;

	}
	
	public static void main ( String []args )
	{
		int k = 1;
       
		 String[] str = new String[]{"contest", "kontest"};
        int actual = howMuch(str, k);
		
		System.out.println(actual);
		
		
		
	}

}



