public class DivToZero {
	public static String lastTwo(int num, int factor) {
	    String temp=String.valueOf(num);
	    String cut=temp.substring(0,temp.length()-2);
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					String l_two =String.valueOf(i)+String.valueOf(j);
					String merge=cut+l_two;
					if(Integer.parseInt(merge) % factor == 0){ return l_two;}
				}
			}
	 return "00";
	}
}
