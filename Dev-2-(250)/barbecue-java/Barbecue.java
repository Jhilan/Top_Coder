import java.util.Arrays;
public class Barbecue {
	public static int eliminate(int n, int[] voter, int[] excluded) {
     int[] v =new int[n];
     int[] count = new int[n];
     int max=Integer.MIN_VALUE , out=-1;
     Arrays.fill(v, 0);  Arrays.fill(count, 0); 
     for (int i = 0; i < voter.length; i++) {
		v[voter[i]]++;
		 count[excluded[i]]++;
	}
	for (int i = 0; i < n; i++) {
		if(max < count[i])max=count[i];
	}
	for (int i = 0; i < v.length; i++) {
		if(max == count[i])
		{
		 if(out == -1)
		 {
		   out =i;
		   continue;
		 }
			if(v[i] > v[out])out=i;
		}
	}

	    return out;
}
	public static void main(String[] args) {
		int n=3; 
		int[] voter={0,2,2};
		int[] excluded={2,0,1};
		
		System.out.println(eliminate(n, voter, excluded));

	}
}













