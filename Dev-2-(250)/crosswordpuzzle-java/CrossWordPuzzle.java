public class CrossWordPuzzle {
	public int countWords(String[] board, int size) {
	int ans=0;
	  for (int i = 0; i < board.length; i++) {
			String [] all = board[i].split("X");
			for (int k = 0; k < all.length; k++) {
				if(all[k].length() == size)ans++;
			}
		}
	return ans;
	}
}
