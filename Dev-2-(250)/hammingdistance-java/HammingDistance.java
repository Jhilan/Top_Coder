import java.util.Collections;
import java.util.LinkedList;
public class HammingDistance {
	public int minDistance(String[] numbers) {
		LinkedList<Integer>all=new LinkedList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
		for (int k = i; k < numbers.length; k++) {
			int ans=0;
			if(i != k){
			for (int j = 0; j < numbers[i].length(); j++) {
				if(numbers[i].charAt(j) != numbers[k].charAt(j))ans++;
			}
			all.add(ans);
			}
			}
		}
		Collections.sort(all);
	    return all.get(0);
	}
}
