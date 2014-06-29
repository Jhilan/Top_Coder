import java.util.Collections;
import java.util.LinkedList;
public class TeamSplit {
	public int difference(int[] strengths) {
     int t1_sum=0, t2_sum=0;
		LinkedList<Integer> all =new LinkedList<Integer>();
		 LinkedList<Integer> t1 =new LinkedList<Integer>();
		 LinkedList<Integer> t2 =new LinkedList<Integer>();
	   for (int x : strengths) {
		all.add(x);
	}
	   Collections.sort(all);
	   Collections.reverse(all);
		while(!all.isEmpty()) {
		t1.add(all.poll());
		if(!all.isEmpty())
		{t2.add(all.poll());}
		}
	  for (int x : t1) {
		t1_sum+=x;
	}
	  for (int x : t2) {
			t2_sum+=x;
		}
		
return Math.abs(t1_sum-t2_sum);
	}
}

	