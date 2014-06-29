import java.util.Arrays;

 public class NoisySensor {
	public int[] medianFilter(int[] data) {
		int test[]= new int[3];
		int []ans=new int[data.length];
		for (int i = 1; i < data.length-1; i++) {   
					test[0]=data[i-1];
					test[1]=data[i];
					test[2]=data[i+1];
				 Arrays.sort(test);
				 ans[i]=test[1];
		}
		ans[0]=data[0];
		ans[data.length-1]=data[data.length-1];
		
	return ans;
	}
}
