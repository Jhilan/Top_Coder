public class CalcTest {
	public String[] uniform(String[] numbers) {
		String[] ans =new String[numbers.length];	
		for (int i = 0; i < numbers.length; i++) {
		   StringBuilder x =new StringBuilder();
		   String all=numbers[i];
		   for (int j = 0; j < all.length(); j++) {
			   int z=(int)all.charAt(j);
if( (z != 32) && (z >= 48) && (z <= 57) )x.append(String.valueOf((char)z));
			if((z < 48 || z > 57) && (z != 32) )x.append(".");
		}
		   ans[i]=new String (x);
		}
	return ans;
	}
}
