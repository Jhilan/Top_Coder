public class Average {

	public int belowAvg(int[] math, int[] verbal) {
		int ans=0;
		double c=0,avg=0;
		for (int i = 0; i < verbal.length; i++) {
			math[i]+=verbal[i];
		}
		for (int i = 0; i < verbal.length; i++) {
			c+=math[i];
		}
		avg=c/math.length;
		for (int i = 0; i < verbal.length; i++) {
			if(math[i] < avg)ans++;
		}
	return ans;
	}

}
