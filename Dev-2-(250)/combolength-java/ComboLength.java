public class ComboLength {
	public int howLong(String moves) {
		int cA=0,max=0,cB=0,ca=0,cb=0,count=0;
		int[]A=new int[50];
		int[]B=new int[50];
		while (count < moves.length()) {
			if(moves.charAt(count) == 'A'){cA++;B[cb++]=cB;cB=0;}
			if(moves.charAt(count) == 'B'){cB++;A[ca++]=cA;cA=0;}
			count++;
		}	
		A[A.length-1]=cA;
		B[B.length-1]=cB;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > max)max=A[i];
		}
		for (int i = 0; i < B.length; i++) {
			if(B[i] > max)max=B[i];
		}
		return max;
	}
}
