public class DerivativeSequence {
	public int[] derSeq(int[] a, int n) {
		
		if(n == 0) {return a;}
		int x[] = new int[a.length-1];
		for (int i = 1; i < a.length; i++) {
			x[i-1]= a[i]-a[i-1];
		}
		
		return derSeq(x,n-1);
}
	}
