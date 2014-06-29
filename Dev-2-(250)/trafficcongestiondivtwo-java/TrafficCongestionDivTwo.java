public class TrafficCongestionDivTwo {
	public long theMinCars(int treeHeight) {
		long ans=0;
		long tree= treeHeight;
	    ans=(1/3)*(long) (Math.pow(-1, tree)+Math.pow(2, tree+1));
		
		
		return ans;
	}
}
