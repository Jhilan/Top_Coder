public class FarFromPrimes {
	public int count(int A, int B) {
		int ans=0;
		for (int i = A; i <= B; i++) {
			int temp=0;
			for (int j = i-10; j <= i+10; j++) {
				if(IS_prime(j)){temp =1;}
			}
			if(temp == 0) ans++;
		}
		return ans;
	}
	public static boolean IS_prime(int x)
	{
	  for (int i = 1; i < x; i++) {
		if(x % i == 0 && i != 1 )return false;
	}
	  return true;
	}
}
