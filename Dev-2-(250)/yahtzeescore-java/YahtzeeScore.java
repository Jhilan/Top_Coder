public class YahtzeeScore {
	public static int maxPoints(int[] toss) {
		 int ans=0;
		for (int i = 0; i < toss.length; i++) {
			int  count=toss[i];
			for (int j = i; j < toss.length; j++) {
				if(toss[i] == toss[j] && i != j )
				{count+=toss[i];}
			}
			ans=Math.max(ans, count);
		}
		return ans;
	}
}
