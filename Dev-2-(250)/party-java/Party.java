public class Party {
public double averageNames(int n, int[] personA, int[] personB) {
		
	boolean[] []all=new boolean[n][n];
	double ans=0;
	for (int i = 0; i < n; i++) {
		all[i][i]= true;
	}
	
	for (int i = 0; i < personA.length; i++) {
		for (int j = 0; j < n; j++) {
			if(all[personA[i]][j] || all[personB[i]][j])
			{
				all[personA[i]][j] = all[personB[i]][j] =true;
			}
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <n; j++) {
			if( i != j && all[i][j])ans++;
		}
	}
	
	return ans/n;
	}
}
