public class TestCurve {
	public int[] determineGrades(int[] scores) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < scores.length; i++) {
			if(max < scores[i])max=scores[i];
		}
		for (int i = 0; i < scores.length; i++) {
				scores[i]=100*scores[i]/(max);
		}
		return scores;
	}
}
