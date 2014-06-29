public class SignatureDecorator {
	public String applyDecoration(String name, String[] commands, String[] decorations) {
		 String ans=name;
		 for (int i = 0; i < commands.length; i++) {
			if(commands[i].equals("prepend"))ans=decorations[i]+ans;
				if(commands[i].equals("append"))ans=ans+decorations[i];
					if(commands[i].equals("surround")){
						String temp="";
						for (int j = decorations[i].length()-1; j >=0; j--) {
							temp+=decorations[i].charAt(j);
						}
						ans=decorations[i]+ans+temp;
						}	
		}
	 return ans;
	}
}
