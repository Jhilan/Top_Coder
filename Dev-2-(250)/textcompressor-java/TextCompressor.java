public class TextCompressor {
	public static String longestRepeat(String sourceText) {
		String ans="",	result="";
		int max=0;
		for (int i = 0; i < sourceText.length(); i++) {
			for (int j = i; j <sourceText.length(); j++) {
				String t=sourceText.substring(i,j);
				String rest=sourceText.substring(j);
				if(rest.contains(t)) 
				{
					result=t;
				if(result.length() > max)
				{
					max=result.length(); ans=result;
					}
				}
				}
			}
	return ans;
	}
}
