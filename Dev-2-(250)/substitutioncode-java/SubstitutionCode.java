public class SubstitutionCode {
	public int getValue(String key, String code) {
		String ans="";
		for (int i = 0; i < code.length(); i++) {
			for (int j = 1; j <= 10; j++) {
				if((code.charAt(i) == key.charAt(j-1)) && (j == 10))ans+="0";
				if((code.charAt(i) == key.charAt(j-1)) && (j != 10 ))ans+=String.valueOf(j);
			}
		}
		return Integer.parseInt(ans);
	}
}
