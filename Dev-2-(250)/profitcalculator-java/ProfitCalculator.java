public class ProfitCalculator {
	public int percent(String[] items) {
		int ans=0;
		 double price=0,cost=0,profit=0;
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length(); j++) {
				String []all=items[i].split(" ");
				price+=Double.parseDouble(all[0]);
				cost+=Double.parseDouble(all[1]);
			}
		}
		profit=((price-cost)/price)*100;
		return ans=(int)profit;
	}

}
