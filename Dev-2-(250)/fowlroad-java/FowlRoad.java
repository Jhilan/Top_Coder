public class FowlRoad {
	public int crossings(int roadY, int[] bobX, int[] bobY) {
	int ans=0, temp_y=bobY[0];
		for (int i = 1; i < bobX.length; i++) {
			if((bobY[i-1] < roadY && bobY[i] > roadY) || (bobY[i-1] > roadY && bobY[i] < roadY) 
	|| ((roadY == bobY[i-1]) &&  ((temp_y < roadY && bobY[i] > roadY) ||  (temp_y > roadY && bobY[i] < roadY))))
				{ans++;temp_y=bobY[i];}
		}
		return ans;
	}
}
