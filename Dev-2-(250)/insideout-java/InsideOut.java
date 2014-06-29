public class InsideOut {
	public static String unscramble(String line) {
		String F="",S="";
		String f=line.substring(0,line.length()/2);
		String s=line.substring(line.length()/2);
		for (int i = f.length()-1; i >= 0 ; i--) {
			F+=f.charAt(i);
		}
        for (int j = s.length()-1; j >= 0 ; j--) {
        	S+=s.charAt(j);
		}
	    return F+S;
	}
}
