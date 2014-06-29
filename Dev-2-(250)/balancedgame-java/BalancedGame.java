public class BalancedGame {
	public int result(String[] conflicts, int p, int q) {
		int ans=-1;
		
		for (int i = 0; i < conflicts.length; i++) {
			int count=0,count2=0;
			for (int j = 0; j < conflicts[i].length(); j++) {
				if(conflicts[i].charAt(j)== 'W')count++;
				if(conflicts[i].charAt(j)== 'L')count2++;
			}
if( count < (Math.ceil((conflicts.length-1)*p)/100)   ||  ( count2 < (Math.ceil((conflicts.length-1)*q)/100)))
		{return i;}
		}
	return ans;
	}
}
