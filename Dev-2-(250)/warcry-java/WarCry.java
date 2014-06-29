public class WarCry {
	public int alertTime(String outposts) {
		int ans=0;
		char[] all =outposts.toCharArray();
		
		for (int i = 0; i < all.length; i++) {
			int length= all.length;
			for (int j = 0; j < all.length; j++) {
				if(all[j] == 'x')
				{
					length=Math.min(length, Math.abs(j-i));
				}
			}
			ans=Math.max(ans, length);
		}
		return ans;
	}
}
