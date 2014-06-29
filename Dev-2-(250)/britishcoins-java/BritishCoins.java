public class BritishCoins {
	public int[] coins(int pence) {
		int pns=0,shil=0,pound=0;
		pound=pence/(12*20);
		pence=pence % (12*20);
		shil=pence/12;
		pence=pence%12;
		
		return new int []{pound,shil,pence};
		
	}
}
