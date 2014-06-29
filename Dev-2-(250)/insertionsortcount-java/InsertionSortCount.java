
public class InsertionSortCount {
	public int countMoves(int[] A) {
		int ans=0;
		for (int i = 1; i < A.length; i++) {
			
			int stored= A[i];
			int j = i;
			
			while(j > 0 && (stored < A[j-1]))
			{
				A[j]= A[j-1];
				ans++;
				j--;
			}
			A[j]=stored;
		}
		return ans;
	}
}
