public class TaxTable {
	public int income(int taxAmount) {
		double[] least={100000,117250,178650,319100};
		double[] less_than={117250,178650,319100,Integer.MAX_VALUE};
		double[] Multipier={0.25,0.28,0.33,0.35};
		double[] sub={6525.00,10042.50,18975.00,25357.00};
		
		for (int i = 0; i < sub.length; i++) {
			double res = (taxAmount+sub[i])/Multipier[i];
			if(res >= least[i] && res < less_than[i])return  (int)Math.round(res);
		}
		return -1;
	}
}
