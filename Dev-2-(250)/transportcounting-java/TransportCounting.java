public class TransportCounting {
	public static int countBuses(int speed, int[] positions, int[] velocities, int time) {
		int ans=0;
		for (int i = 0; i < velocities.length; i++) {
			if((time * speed) >= positions[i]+(velocities[i]*time) || positions[i]==0)ans++;
		}
return ans;
	}

}
