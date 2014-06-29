public class AdditionCycles {
	public static int cycleLength(int n) {
		
		int cur=n , ans=0;
		do{
		  ++ans;
		  cur=(cur/10 + cur%10)%10 +(cur%10)*10;
		}while(cur != n);
		
		return ans;
	}
	
	public static void main(String [] args){
		
		int n=26;         
		
		System.out.println(cycleLength(n)+"\n\n");
		
		System.out.println(8.6 % 10);
	}

}
