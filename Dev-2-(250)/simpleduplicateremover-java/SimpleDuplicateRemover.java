import java.util.Collections;
import java.util.LinkedList;
public class SimpleDuplicateRemover {
	public static int[] process(int[] sequence) {
		LinkedList<Integer>all  = new LinkedList<Integer>();
		for (int i = sequence.length-1; i >= 0; i--) {
				if(!all.contains(sequence[i]))all.add(sequence[i]);
		}
		Collections.reverse(all);
		int[] ans=new int[all.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=all.get(i);
		}
		return ans;
	}
}
