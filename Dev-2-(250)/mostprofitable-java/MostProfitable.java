public class MostProfitable {
	public static String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		String ans="";
		int max=0;
		for (int i = 0; i < items.length; i++) {
			int t=(prices[i]-costs[i])*sales[i];
			if(t > max){ans=items[i];max=t;}
		}
return ans;
	}
}
