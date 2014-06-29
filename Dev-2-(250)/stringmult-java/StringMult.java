public class StringMult {
	public String times(String sFactor, int iFactor) {
		String ans="",temp="",res="";
		if(sFactor == "")return ans;
		if(iFactor ==0)return ans;
		if(iFactor > 0)
		{
		    for (int i = 0; i < iFactor; i++) 
			ans+=sFactor; 
		    return ans;
		}
	    for (int i = sFactor.length()-1; i >=0; i--)
			temp+=sFactor.charAt(i);
	    for (int i = 0; i < iFactor*-1; i++) 
			res+=temp;
		return res;
	}
}
