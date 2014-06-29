import java.util.Arrays;
public class IBEvaluator {
	public static int[] getSummary(int[] predictedGrades, int[] actualGrades) {
		int []ans =new int [7];
		Arrays.fill(ans, 0);
		for (int i = 0; i < predictedGrades.length; i++) {
			int dif=Math.abs(predictedGrades[i]-actualGrades[i]);
			ans[dif]++;
		}
		for (int i = 0; i < ans.length; i++) {
			if(ans[i] != 0){
				double x=ans[i],y=predictedGrades.length;
			ans[i]=(int)((x/y)*100);
			}	
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] predictedGrades = new int[]{1, 1, 1};
        int[] actualGrades = new int[]{5, 6, 7};
        
        System.out.println(getSummary(predictedGrades, actualGrades));
	}
}
