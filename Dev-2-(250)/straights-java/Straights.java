public class Straights {
	public int howMany(int[] hand, int k) {
		 int sum = 0;
		    for (int i = 0; i <= hand.length-k; i++) {
		       int prod = 1;
		       for (int j = 0; j < k; j++) prod *= hand[i+j];
		       sum += prod;
		    }
		    return sum;
	}
}
