public class Taxi {
	public double maxDis(int maxX, int maxY, int taxiDis) {
		int min=Math.min(maxX, maxY);
		int max=Math.max(maxX, maxY);
		if(max >= taxiDis) return taxiDis;
		
		double half = max;
		double rest = taxiDis - half;
		if(rest > min) return -1.0;
		
		
		return Math.sqrt((half * half) + (rest * rest));
	}
}
