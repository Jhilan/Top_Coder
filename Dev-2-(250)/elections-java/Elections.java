public class Elections {
	public int visit(String[] likelihoods) {
	int ans=0;
	double temp=0,min=Integer.MAX_VALUE;
	
		for (int i = 0; i < likelihoods.length; i++) {
			int C=0;
			double l =likelihoods[i].length();
			for (int j = 0; j < l; j++) {
				if(likelihoods[i].charAt(j) == '1')C++;
			}
			temp=((C/l)*100);
			if(temp < min){min=temp;ans=i;}
		}
		return ans;
	}
}
