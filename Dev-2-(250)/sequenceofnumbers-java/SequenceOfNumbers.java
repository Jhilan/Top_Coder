import java.util.Arrays;
public class SequenceOfNumbers {
	public String[] rearrange(String[] sequence) {
	int []all= new int [sequence.length];
	for (int i = 0; i < all.length; i++) {
		all[i]=Integer.parseInt(sequence[i]);
	}
	Arrays.sort(all);
		for (int i = 0; i < all.length; i++) {
			sequence[i]=String.valueOf(all[i]);
		}
		
	return sequence;
	}
}
