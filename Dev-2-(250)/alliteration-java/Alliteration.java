public class Alliteration {
	public static int count(String[] words) {
		
		int count=0;
		int len=1;
		for (int i = 0; i < words.length; i++) {
			words[i]=words[i].toLowerCase();
		}
		char prev=words[0].charAt(0);
		
		for (int i = 1; i < words.length; i++) {
			if(words[i].charAt(0) != prev)
			{
				if(len>1)
				{count++;}
				
				len=1;
				prev=words[i].charAt(0);
			}
			else len++;
		}
      if(len > 1)
    	  {count++;}
      
      return count;
	}
	public static void main(String [] args){
		
		String[] words = new String[]{"Round", "the", "rugged", "rock", "the", "ragged", "rascal", "ran"};

		System.out.println(count(words));
	}
}
