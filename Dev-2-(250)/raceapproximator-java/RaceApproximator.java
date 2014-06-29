public class RaceApproximator {

	public String timeToBeat(int d1, int t1, int d2, int t2, int raceDistance) {
		
		 int ans= (int) (cal(d1, t1, d2, t2, raceDistance));
		
		
		return String.format("%d:%02d:%02d", ans/3600, (ans/60) % 60,ans % 60 );
	}
   public double cal(double d1, double t1, double d2, double t2, double raceDistance){
	   double ans=t1*Math.exp(Math.log(t2/t1)*Math.log(d1/raceDistance)/Math.log(d1/d2));
	   return ans;
   }
}
