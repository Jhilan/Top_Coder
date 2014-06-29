public class RunLengthEncoding {
	public static String decode(String text) {
	   String num="";
	   String res="";
	   for (int i = 0; i < text.length(); i++) {
		char c= text.charAt(i);
		if(c >= '0' && c <= '9')
		{
			num+=c;
		}
		else
			{
			int cnt=1;
			if(!num.equals(""))
			{
				if(num.length() > 2) return "TOO LONG";
				cnt=Integer.parseInt(num);
				num="";
			}
			for (int j = 0; j < cnt; j++) {
				 res+=c;
				}
			}
		}
	return res.length() > 50? "TOO LONG" : res;
	}
}
