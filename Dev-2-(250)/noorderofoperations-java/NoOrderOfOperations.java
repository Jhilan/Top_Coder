public class NoOrderOfOperations {
	public static int evaluate(String expr) {
		int ans=0;
		if(expr.length() == 1)return Integer.parseInt(expr);
		String [] all=expr.split("[-+*]");
		String [] op=expr.split("[0123456789]");
		ans=Integer.parseInt(all[0]);
		for (int i = 0; i < all.length-1; i++) {
			 if(op[i+1].equals("+"))ans+=Integer.parseInt(all[i+1]);
			 if(op[i+1].equals("-"))ans-=Integer.parseInt(all[i+1]);
			 if(op[i+1].equals("*"))ans*=Integer.parseInt(all[i+1]);
		}
		return ans;
	}
}
