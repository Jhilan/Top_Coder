public class AccessChanger {
	public String[] convert(String[] program) {	
		for (int i = 0; i < program.length; i++) {
			for (int j = 0; j < program[i].length()-1; j++) {
				if((program[i].charAt(j) == '/') && (program[i].charAt(j+1) == '/' )){
					String first=program[i].substring(0, j);
					String second=program[i].substring(j);
					if(first.contains("->"))
						{first=first.replace("->", ".");}
					program[i]=first+second;
					break;
				}
				if(!program[i].contains("//")){
					program[i]=program[i].replace("->", ".");
				}
			}
		}
	return program;
	}
}
