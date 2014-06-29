import java.util.Arrays;
import java.util.LinkedList;
public class ClassScores {
	public int[] findMode(int[] scores) {
		LinkedList<Integer>maxes = new LinkedList<Integer>();
	    int[] count =new int [101];
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < scores.length; i++) {
			count[scores[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if(max < count[i]){max=count[i];}
		}
		for (int i = 0; i < count.length; i++) {
			if(max == count[i]){maxes.add(i);}
		}
		Arrays.sort(scores);
		if(maxes.size() == scores.length)return (scores);
		int [] ans = new int[maxes.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=maxes.get(i);
		}	
		return ans;
	}
}
