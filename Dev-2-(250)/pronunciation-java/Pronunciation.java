public class Pronunciation {
	public boolean isVowel(char c){
		c=Character.toLowerCase(c);
		return c=='a' || c=='e' ||  c=='u' ||  c=='i' ||  c=='o'   ;
	}
	public String canPronounce(String[] words) {
	 String ans="";
	 
	 for (String x : words) {
		for (int i = 2; i < x.length(); i++) {
			if(!isVowel(x.charAt(i-2)) && !isVowel(x.charAt(i-1)) && !isVowel(x.charAt(i)))return x;
		}
		
		for (int j = 1; j < x.length(); j++) {
			if(isVowel(x.charAt(j)) && isVowel(x.charAt(j-1)) &&
		    Character.toLowerCase(x.charAt(j)) != Character.toLowerCase(x.charAt(j-1))){return x;}
		}
	}
	return ans;
	}
}
