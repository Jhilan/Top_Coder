public class FontSize {
	public int getPixelWidth(String sentence, int[] uppercase, int[] lowercase) {
		int ans=0;
		char[] up=new char[26];
		char[] down=new char[26];
		for (int i = 0; i < up.length; i++) {
			up[i]=(char) (65+i);
			down[i]=(char)(97+i);
		}
		char []all=sentence.toCharArray();
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < up.length; j++) {
				if(all[i] == up[j])ans+=(uppercase[j]+1);
		}
			for (int j = 0; j < down.length; j++) {
				if(all[i] == down[j])ans+=(lowercase[j]+1);
		}
			if(all[i] == ' '){ans+=4;}
		}
	return --ans;
	}
}
