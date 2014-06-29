public class ObjectPacking {
	public int smallBox(int objWidth, int objLength, int[] boxWidth, int[] boxLength) {
		int ans=Integer.MAX_VALUE,min=0;
		for (int i = 0; i < boxLength.length; i++) {
			if((boxWidth[i] >= objWidth && boxLength[i] >= objLength )
					|| (boxWidth[i] >= objLength && boxLength[i] >= objWidth ))
			{
				min=boxLength[i]*boxWidth[i];
				ans=Math.min(ans, min);
			}	
		}
	   if(ans == Integer.MAX_VALUE)return -1;
		return ans;
	}
}
