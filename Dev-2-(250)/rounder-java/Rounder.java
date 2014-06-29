public class Rounder {
	public int round(int n, int b) {
		int less=0,max=0;
		less=n%b;
		less=n-less;
		max=less+b;
		if(less+b ==n)return n;
		if(n-less < max-n)return less;
		return max;
	}
}
