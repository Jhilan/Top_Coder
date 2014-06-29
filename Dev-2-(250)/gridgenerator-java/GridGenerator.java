public class GridGenerator {
	public int generate(int[] row, int[] col) {
		int[][]all =new int [row.length][col.length];
		for (int i = 0; i < all.length; i++) {
			all[i][0]=col[i];
			all[0][i]=row[i];
		}
		for (int i = 1; i < all.length; i++) {
			for (int j = 1; j < all.length; j++) {
				all[i][j]=(all[i][j-1])+(all[i-1][j-1])+(all[i-1][j]);
			}
		}
	return all[row.length-1][col.length-1];
	}
}
