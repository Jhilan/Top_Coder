public class AccessLevel {
	public static String canAccess(int[] rights, int minPermission) {
		String ans="";
		for (int i = 0; i < rights.length; i++) {
			if(rights[i] >= minPermission)ans+="A";
			else{ans+="D";}
		}
	return ans;
	}
}
