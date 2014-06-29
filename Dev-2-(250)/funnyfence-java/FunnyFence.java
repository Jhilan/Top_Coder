public class FunnyFence {
	public int getLength(String s) {
		
		int count=0,max=0,ans=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) != s.charAt(i+1)){
				count++;
				ans=Math.max(count, ans);
			}
			else{
				max=count;
				ans=Math.max(max, ans);
				count=0;
			}
		}
		return ans+1;
	}

}
