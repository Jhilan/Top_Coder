import java.util.Arrays;
public class Cards {
	public String[] deal(int numPlayers, String deck) {
		String []ans =new String[numPlayers]  ;
		Arrays.fill(ans, "");
		for (int i = 0; i < deck.length(); i++) {	
			for (int j = 0; j < ans.length; j++) {
				if(ans[j].length() < deck.length()/numPlayers)
				{ans[j]+=deck.charAt(j+(i*numPlayers));}
			}	
		}
	return ans;
	}
}
