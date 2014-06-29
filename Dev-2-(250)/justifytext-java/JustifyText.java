public class JustifyText {
	public String[] format(String[] text) {
		int max=0;
		for (int i = 0; i < text.length; i++) {
			if(text[i].length() > max)max=text[i].length();
		}
		for (int i = 0; i < text.length; i++) {
		int space= max-text[i].length();
		while(space > 0){
			text[i]=" "+text[i];
		    space--;
		}
		}
		return text;
	}
}
