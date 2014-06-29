public class Education {
	public static int minimize(String desire, int[] tests) {
		double sum=0.0,all=tests.length+1;
		for (int j = 0; j < tests.length; j++) {sum +=tests[j];}
		for (int i = 0; i <= 100; i++) 
		{
			sum+=i;
			if(sum/all >= 90 && desire.equals("A"))return i;
			if(sum/all >= 80 && desire.equals("B"))return i;
			if(sum/all >= 70 && desire.equals("C"))return i;
			if(sum/all >= 60 && desire.equals("D"))return i;
		}
		return -1;
	}
}
