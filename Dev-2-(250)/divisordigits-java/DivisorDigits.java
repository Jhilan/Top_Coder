public class DivisorDigits {
	public int howMany(int number) {
		int ans=0;
		String n=String.valueOf(number);
		for (int i = 0; i < n.length(); i++) {
			int x=Integer.parseInt(String.valueOf(n.charAt(i)));
			if( x != 0 && number % x == 0)ans++;
		}
		return ans;
	}
}
