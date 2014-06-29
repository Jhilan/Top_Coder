public class CheckFunction {
	public int newFunction(String code) {
		int ans=0;
		int []all = {6,2,5,5,4,5,6,3,7,6};
		for (int i = 0; i < code.length(); i++) {
			ans+=all[code.charAt(i)-48];
		}
		return ans;
	}
}
