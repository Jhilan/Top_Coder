public class Aquarium {
	public static int peaceful(int minSize, int maxSize, int[] fishSizes) {
		int ans=0;
		for (int i = minSize; i <= maxSize; i++) {
			int temp=0;
			for (int j = 0; j < fishSizes.length; j++) {
			if(((i < fishSizes[j]*2) || (i > fishSizes[j]*10) ) && ((i*2 > fishSizes[j]) || (i*10 < fishSizes[j])))
			{temp++;}   
			}
			if(temp == fishSizes.length)ans++;
		}
	return ans;
	}
	public static void main(String[] args) {
		int minSize=1, maxSize=36;
		int[] fishSizes={3};
		System.out.println(peaceful(minSize, maxSize, fishSizes));
	}
}
