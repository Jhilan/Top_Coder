public class AccountBalance {
	public int processTransactions(int startingBalance, String[] transactions) {
		for (int i = 0; i < transactions.length; i++) {
			String []temp= transactions[i].split(" ");
			if(temp[0].equals("C"))startingBalance+=Integer.parseInt(temp[1]);
			if(temp[0].equals("D"))startingBalance-=Integer.parseInt(temp[1]);
		}
		return startingBalance;
	}
}
