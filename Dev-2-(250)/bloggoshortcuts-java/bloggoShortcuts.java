public class bloggoShortcuts {
	public static String expand(String text) {
		String ans=""; int count=0,count2=0;
		for (int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) == '_' )
			{
				if(count%2 == 0)ans+="<i>";
				if(count%2 != 0)ans+="</i>";
			    count++;
			}
			if(text.charAt(i) == '*')
			{
				if(count2%2 == 0)ans+="<b>";
				if(count2%2 != 0)ans+="</b>";
			    count2++;
			}
			if(text.charAt(i) != '_' && text.charAt(i) != '*' )ans+=text.charAt(i);
		}
	return ans;
	}
}
