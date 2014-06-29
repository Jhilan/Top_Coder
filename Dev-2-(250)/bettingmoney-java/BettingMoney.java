public class BettingMoney {
	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int gain=0,lose=0;
		for (int i = 0; i < amounts.length; i++) {
			if(finalResult != i)gain+=amounts[i];
			if(finalResult == i)lose+=amounts[i]*centsPerDollar[i];
		}
		gain*=100;
		return gain-lose;
	}

}
