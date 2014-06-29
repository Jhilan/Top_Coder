public class PackingParts {
	public int pack(int[] partSizes, int[] boxSizes) {
		int ans=0;
		for (int i = 0; i < partSizes.length; i++) {
			for (int j = 0; j < boxSizes.length; j++) {
				if(partSizes[i] <= boxSizes[j])
                 {
					ans++;
					partSizes[i]=150;
					boxSizes[j]=-1;
                 }
			}
			
		}
		return ans;
	}
}
