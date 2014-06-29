import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
public class BuyingCheap {
	public int thirdBestPrice(int[] prices) {
		SortedSet<Integer> all=new TreeSet<Integer>();
		for (int i = 0; i < prices.length; i++) {
			all.add(prices[i]);
		}
		LinkedList<Integer> list=new LinkedList<Integer>(all);
		if(list.size() < 3){return -1;}
		return list.get(2);
	}
}
