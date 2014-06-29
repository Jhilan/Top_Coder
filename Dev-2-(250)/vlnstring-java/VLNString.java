public class VLNString {
	public String makeAcronym(String longName) {
		String ans="";
		String []all=longName.split(" ");
		for (int i = 0; i < all.length; i++) {
			if(!all[i].equals("of") && !all[i].equals("the" )&& !all[i].equals("and") && all[i].length() >= 1)
				ans+=String.valueOf(all[i].charAt(0));
		}
		return ans.toUpperCase();
		 
	}
}
