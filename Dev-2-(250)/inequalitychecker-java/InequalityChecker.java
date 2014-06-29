public class InequalityChecker {
	public int[] getDifferences(int n) {
	int[] ans=new int[2];
	int s=0, S=0,N=0,N2=0;
		for (int i = 1; i <= n-1; i++) {
			s+=Math.pow(i, 3);
		}
		S = s+(int)Math.pow(n, 3);
		N=(S+s)/2;
		N2=(int)(Math.pow(n,4)/4);
		N-=N2;
	
		
	
		return ans;
	}
}
