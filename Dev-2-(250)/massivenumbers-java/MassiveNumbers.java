public class MassiveNumbers {
	public String getLargest(String numberA, String numberB) {
		String [] A =numberA.split("\\^");
		String [] B =numberB.split("\\^");
		
		int a=Integer.parseInt(A[0]);
		int b=Integer.parseInt(A[1]);
		int c=Integer.parseInt(B[0]);
		int d=Integer.parseInt(B[1]);
		
		if(b*Math.log(a) > d*Math.log(c))return numberA;	
		
		return numberB;
 
	}
}
