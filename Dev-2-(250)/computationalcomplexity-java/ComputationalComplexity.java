public class ComputationalComplexity {
	public int fastestAlgo(int[] constant, int[] power, int[] logPower, int N) {
double best=1e100 ; int ans=0;
	for (int i = 0; i < constant.length; i++) {
	double temp=1.0 *constant[i] * Math.pow(N, power[i]) * Math.pow(Math.log(N), logPower[i]);
 if(temp < best)
		 {
			ans=i;
			best=temp;	
		 }	 
	}
 return ans;
	}
}
