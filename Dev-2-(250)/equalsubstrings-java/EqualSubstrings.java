public class EqualSubstrings {
	public static int count(String x, char c)
	{
		int count=0;
		for (int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == c)count++;
		}
		return count;
	}
	public static String[] getSubstrings(String str) {
	 String a="",b=str;
	for (int i = 0; i <= str.length(); i++) {
		String f=str.substring(0, i);   String s=str.substring(i);
		if( count(f,'a') == count(s,'b')){a=f; b=s;}
	}
	 return new String[]{a,b};
	}
}
