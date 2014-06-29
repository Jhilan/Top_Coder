public class Medici {
	public int winner(int[] fame, int[] fortune, int[] secrets) {
		int []sum=new int[fame.length];
		for (int i = 0; i < fame.length; i++) {
			int x=Math.min(fame[i], fortune[i]);
		     sum[i]=Math.min(x, secrets[i]);
		}
		int ans=sum[0],z=0,finaL=0;
	    for (int i = 0; i < sum.length; i++) {
			if(sum[i] > ans) ans=sum[i];
	    }
		for (int i = 0; i < sum.length; i++) {
			if(ans==sum[i]){z++;finaL=i;}
		}
		if(z > 1)return -1;
		return finaL;
	}

}
