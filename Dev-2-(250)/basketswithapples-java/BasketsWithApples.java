import java.util.Arrays;

public class BasketsWithApples {
	public int removeExcess(int[] apples) {
	int ans=0;
	Arrays.sort(apples);
	for (int i = 0; i < apples.length; i++) {
		ans=Math.max(apples[i]*(apples.length-i), ans);
		}
		return ans;
	}
}
