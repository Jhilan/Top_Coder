public class MultiRead {
	public int minCycles(String trace, int procs) {
		int ans=0;	
		for (int i = 0; i < trace.length(); i++) {
			if(trace.charAt(i) == 'W')ans++;
		}
		String [] all = trace.split("W");
		for (int i = 0; i < all.length; i++) {
			if(all[i].length() <= procs && all[i].length() >= 1)ans++;
			if(all[i].length() > procs)
			{
				int x= all[i].length();
				while(x > 0)
				{
					ans++;
					x-=procs;
				}
			}
		}
		return ans;
	}
}
