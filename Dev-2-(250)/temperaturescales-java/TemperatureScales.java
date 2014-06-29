public class TemperatureScales {
	public double convert(int f1, int b1, int f2, int b2, int t){
		double a=(double)(f2-b2)/(f1-b1);
		double b = f2-f1*a;
		
		return a*t+b;
	}
}
