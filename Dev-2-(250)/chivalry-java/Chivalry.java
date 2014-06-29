public class Chivalry {
	public static String getOrder(String first, String second) {
		StringBuilder ans= new StringBuilder();
		while(first.length() > 0 && second.length() > 0)
		{
			if(first.startsWith("M") && second.startsWith("M"))
				{ans.append("M");
			   first= first.substring(1);
				}
			if(first.startsWith("W") && second.startsWith("M"))  
			{  ans.append("W");
			   first= first.substring(1);
				}
			if(first.startsWith("M") && second.startsWith("W"))  
			{  ans.append("W");
			   second= second.substring(1);
				}
			if(first.startsWith("W") && second.startsWith("W"))  
			{  ans.append("W");
			   first= first.substring(1);
				}
		    }
		ans.append(first);
		ans.append(second);
return new String(ans);
	}
}









