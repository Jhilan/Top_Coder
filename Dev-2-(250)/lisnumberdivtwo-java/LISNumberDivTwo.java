public class LISNumberDivTwo {
	public int calculate(int[] seq) {
		int ans=0;
		for (int i = 0; i < seq.length-1; i++) {
			if(seq[i] >= seq[i+1])ans++;
		}
	return ++ans;
	}
}
