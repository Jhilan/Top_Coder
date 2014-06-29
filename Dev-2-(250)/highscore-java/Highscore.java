public class Highscore {
	public int getRank(int[] scores, int newscore, int places) {
		int ans=0;
		if(scores.length == 0 )return 1;
	    int	min=scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(min > scores[i])min=scores[i];
		}
		for (int i = 0; i < scores.length; i++) {
			if(newscore <= min && scores.length == places)return -1;
			if(newscore >= scores[i] && scores.length <= places && newscore >= min)return i+1;
		}
		if(newscore < min && scores.length < places)return (scores.length+1);
      return ans;
	}
}
