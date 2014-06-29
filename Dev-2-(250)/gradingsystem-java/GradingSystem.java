public class GradingSystem {
	public int fairness(int[] scores, int[] grades) {
	int result=0;
	
	int[] temp= new int [scores.length];
	
	int min=0;
	for(int i=0; i< scores.length; i++){
		min=Math.max(min, grades[i]);
		temp[i]=min;
	}
	
	int max=8;
	for (int i = scores.length-1 ; i >= 0; i--) {
		max=Math.min(max, grades[i]);
		result+=Math.abs(temp[i]-max);
	}
	
	return result;
	}
}
