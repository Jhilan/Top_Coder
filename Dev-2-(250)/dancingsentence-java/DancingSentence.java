public class DancingSentence {
	public String makeDancing(String sentence) {
		int check=0;String pre="lower";
		char[] all= sentence.toCharArray();
		  for (int i = 0; i < all.length; i++) {
			  int check2=0;
			 if(all[i] != ' ' && check ==1)
			{
		     if(pre.equals("upper")){
			 all[i] =Character.toLowerCase(all[i]);pre="lower";check2=1;
		     }
		     if(pre.equals("lower") && check2 == 0){
				 all[i] =Character.toUpperCase(all[i]);pre="upper";
			     }
			}
			if(all[i] != ' ' && check == 0){all[i] =Character.toUpperCase(all[i]);check=1;pre="upper";}
		}
		return new String (all);
	}
}
