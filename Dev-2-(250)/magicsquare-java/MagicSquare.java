public class MagicSquare {
	public int missing(int[] square) {
	int k=0;
	int[] z=new int[8];
	for (int i = 0; i < square.length; i++) {
		if(square[i] == -1)k=i;
	}
	for (int i = 1; i <= 100; i++) {
		square[k]=i;
		z[0]=square[0]+square[1]+square[2];
		z[1]=square[3]+square[4]+square[5];
		z[2]=square[6]+square[7]+square[8];
		z[3]=square[0]+square[3]+square[6];
		z[4]=square[1]+square[4]+square[7];
		z[5]=square[2]+square[5]+square[8];
		z[6]=square[2]+square[4]+square[6];
		z[7]=square[0]+square[4]+square[8];
		int c=z[0];
		if(c==z[0] && c==z[1] && c==z[2] && c==z[3] && c==z[4] && c==z[5] && c==z[6] && c==z[7]  )return i;
	}	
return -1;
}}
