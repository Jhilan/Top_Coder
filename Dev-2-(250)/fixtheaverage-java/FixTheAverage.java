public class FixTheAverage {
	public static double add(double[] list, double target) {
		double sum=0;
			for (int j = 0; j < list.length; j++) {
				sum+=list[j];
			}
			double L=list.length;
			return target*(L+1)-sum;
	}
	}
