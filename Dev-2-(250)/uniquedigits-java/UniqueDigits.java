public class UniqueDigits {
	public int count(int n) {
	int ans=0;
		for (int i = 1; i < n; i++) {
			if( i > 10)
			{
				int count = 0;
				String t= String.valueOf(i);
					for (int j = 0; j < t.length(); j++) {
						for (int k = 0; k < t.length(); k++) {
							if(t.charAt(j)==t.charAt(k) && j != k)count++;
						}
					}
				if(count == 0)ans++;	
			}
			if(i <= 10){ans++;}	
		}
	return ans;
	}
}
