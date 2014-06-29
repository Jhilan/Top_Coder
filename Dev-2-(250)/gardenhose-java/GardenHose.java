public class GardenHose {
	public static int  countDead(int n, int rowDist, int colDist, int hoseDist) {
		int ans=0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if((row+1)*rowDist <= hoseDist)continue;
				if((n-row)*rowDist <= hoseDist)continue;
				if((col+1)*colDist <= hoseDist)continue;
				if((n-col)*colDist <= hoseDist)continue;
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int n=3,rowDist=2,colDist=1,hoseDist=2;
		System.out.println(countDead(n, rowDist, colDist, hoseDist));
	}
}
