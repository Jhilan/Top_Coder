public class SyllableCounter {

	public static boolean isvowel (char v){
		//String x=String.valueOf(c).toLowerCase();
		char x= Character.toLowerCase(v);
		return x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ;	
	}
	
	public int countSyllables(String word) {
	int ans=0;
		for (int i = 0; i < word.length(); i++) {
			if(i< word.length()-1){
			if((isvowel(word.charAt(i)) == true) && (isvowel(word.charAt(i+1))== false))ans++;
			}
		}
		if(isvowel(word.charAt(word.length()-1))==true)ans++;
		
		
		
	return ans;
	}
}
