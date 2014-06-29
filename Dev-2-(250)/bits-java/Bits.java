public class Bits {
	public static int minBits(int n) {
		String x=Integer.toBinaryString(n);
		return x.length();
	}
}
