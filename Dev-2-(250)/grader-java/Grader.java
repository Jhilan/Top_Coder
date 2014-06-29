public class Grader {
	public int[] grade(int[] predictedGrades, int[] actualGrades) {
		int [] ans=new int[7];
		double percent=predictedGrades.length;
		int[] diff=new int[predictedGrades.length];
		for (int i = 0; i < diff.length; i++) {
			diff[i]=Math.abs(predictedGrades[i]-actualGrades[i]);
		}
		for (int i = 0; i < diff.length; i++) {
			ans[diff[i]]++;
		}
		for (int i = 0; i < ans.length; i++) {
			ans[i]*=(100/percent);		
		}
		
	return ans;
	}
}
