public class HingedDoor {
	public static int numSwings(int initialAngle, int reduction) {
		int ans=0;
		double angle=initialAngle;
		double re=reduction;
		while(angle > 5.0){
			angle=(1/re)*(angle);
			ans++;
		}
	    return ans;
	}
}
