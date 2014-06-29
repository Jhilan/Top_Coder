public class CultureShock {
	public String translate(String text) {
		String[] ans=text.split(" "); 
		String r="";
		for (int i = 0; i < ans.length; i++)
		{
			if(ans[i].equals("ZEE"))ans[i]="ZED";
		}
		for (int i = 0; i < ans.length; i++) {r+=ans[i]+" ";}
		String x=r.trim();
		return x;
}}
