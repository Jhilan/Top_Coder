public class ColorCode {
	public long getOhms(String[] code) {
		long ans=0; 
		StringBuilder r =new StringBuilder();
		int t=0; String temp =code[0], temp2=code[1],temp3=code[2];
		String []all ={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		int []v={0,1,2,3,4,5,6,7,8,9};
		long []m={1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		
		for (int i = 0; i < all.length; i++) {
			if(temp.equalsIgnoreCase(all[i]))r.append(String.valueOf(v[i]));
			if(temp2.equalsIgnoreCase(all[i]))t=v[i];
			if(temp3.equalsIgnoreCase(all[i]))ans=m[i];
		}
		r.append(String.valueOf(t));
		String R=new String (r);
		ans*=Long.parseLong(R);
	
		return ans;
	}
}
