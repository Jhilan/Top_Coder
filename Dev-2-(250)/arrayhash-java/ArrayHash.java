public class ArrayHash {
	public int getHash(String[] input) {
		int ans=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length(); j++) {
				int t=input[i].charAt(j)-'A';
				ans+=(i+j+t);
			}
		}
	return ans;
	}
}
