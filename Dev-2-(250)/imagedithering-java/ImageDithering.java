public class ImageDithering {
	public int count(String dithered, String[] screen) {
		int ans=0;
		for (int i = 0; i < dithered.length(); i++) {
			for (int j = 0; j < screen.length; j++) {
				for (int k = 0; k < screen[j].length(); k++) {
			   if(screen[j].charAt(k) == (dithered.charAt(i)))ans++;
				}
			}
		}
	return ans;
	}

}
