public class TitleString {
	public static String toFirstUpperCase(String title) {
		char []all=title.toCharArray();
		for (int i = 0; i < all.length; i++) {
			if(all[i] != ' ' && (i==0 || all[i-1] == ' ' ))
				all[i]=(char)(all[i]-32);
		}
		return new String(all);
		 
}}
