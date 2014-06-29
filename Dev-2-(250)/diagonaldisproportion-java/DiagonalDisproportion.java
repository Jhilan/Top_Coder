public class DiagonalDisproportion {
	public int getDisproportion(String[] matrix) {
		int x=0, y=0,count=0;
		int [][] all = new int [matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length(); j++) {
				all[i][j]=Integer.parseInt(String.valueOf(matrix[i].charAt(j)));
			}
		}
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < all.length; j++) {
			if(i == j )x+=all[i][j];
			}
		}
			for (int j = all.length-1; j >= 0; j--) {
			 y+=all[count++][j];
			}
		return x-y;
	}
}
