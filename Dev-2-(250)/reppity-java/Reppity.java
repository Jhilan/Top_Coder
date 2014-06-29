public class Reppity {
	public int longestRep(String input) {
		int ans=0,x=0;
		String temp1="", temp2="";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				temp1=input.substring(i,j);
				temp2=input.substring(j, input.length());
	            if(temp2.contains(temp1))x=temp1.length();
			}
			ans=Math.max(ans, x);
		}
	return ans;
	}
}
