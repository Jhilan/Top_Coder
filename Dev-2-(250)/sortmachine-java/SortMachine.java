import java.util.Collections;
import java.util.LinkedList;

public class SortMachine {
	public int countMoves(int[] a) {
		int ans=0;
		LinkedList<Integer> all = new LinkedList<Integer>();
		LinkedList<Integer> all2 = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			all.add(a[i]);
			all2.add(a[i]);
		}
		Collections.sort(all2);
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(all.get(i) != all2.get(c)){ans++;}
			else {c++;}
		}
		
	
		return ans;
	}
}
