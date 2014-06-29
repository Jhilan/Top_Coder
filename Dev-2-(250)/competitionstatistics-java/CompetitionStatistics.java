public class CompetitionStatistics {
	public int consecutiveGrowth(int[] ratingChanges) {
	int count=0,max=0;
		
	 for (int i = 0; i < ratingChanges.length; i++) {
		if(ratingChanges[i] >0 )
			{
			count++;
			max=Math.max(max, count);
			}
		if(ratingChanges[i] <= 0)count=0;
	}
	return max;
	}
}
