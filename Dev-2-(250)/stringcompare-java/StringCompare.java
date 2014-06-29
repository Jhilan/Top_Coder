public class StringCompare {
	public int simpleDifference(String a, String b) {
		int ans=0;
		int length=Math.min(a.length(), b.length());
		for (int i = 0; i < length; i++) {
			if(a.charAt(i) == b.charAt(i))ans++;
		}
		return ans;
	}
}
