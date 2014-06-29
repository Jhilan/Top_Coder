public class FuelConsumption {
	public static double maximalDistance(int[] velocities, int[] consumptions, int fuel) {
		double ans=0.0;
		for (int i = 0; i < velocities.length; i++) {
			double c=consumptions[i]/1000.0;
			double f=fuel/1000.0;
			double h=f/c;
			double k=velocities[i]*h;
			 ans = Math.max(ans, k);
		}
		return ans;
	}
}
