public class WaiterTipping {
	public int maxPercent(int total, int taxPercent, int money) {
		int ans=0, tax=0;
	    if(taxPercent != 0)tax=total/taxPercent;
		if(money-(total+tax) < 0 )return -1;
		for (int tip = 1; tip <= money ; tip++) {
			if(total + Math.floor(total*taxPercent/100) + Math.floor(total*tip/100) <= money)ans=tip;
		}
		return ans;
	}
}
