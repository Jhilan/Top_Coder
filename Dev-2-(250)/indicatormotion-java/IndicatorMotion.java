public class IndicatorMotion {
	public String getMotion(String program, char startState) {
		String ans=String.valueOf(startState);
		String []sec= program.split("[FRLS]");
		int count=1;
		for (int i = 0; i < program.length(); i++) {
			if(program.charAt(i) =='L' || program.charAt(i) =='R' || program.charAt(i) =='S' || program.charAt(i) =='F')
			{
					for (int k = 0; k < Integer.parseInt(sec[count]); k++) {
				if(program.charAt(i) =='L' && ans.charAt(ans.length()-1) == '|')ans+="\\";
				else if(program.charAt(i) =='L' && ans.charAt(ans.length()-1) == '\\')ans+="-";
				else if(program.charAt(i) =='L' && ans.charAt(ans.length()-1) == '-')ans+="/";
				else if(program.charAt(i) =='L' && ans.charAt(ans.length()-1) == '/')ans+="|";
				///////////////////////////////////////////////////////////////////////////
				if(program.charAt(i) =='R' && ans.charAt(ans.length()-1) == '|')ans+="/";
				else if(program.charAt(i) =='R' && ans.charAt(ans.length()-1) == '/')ans+="-";
				else if(program.charAt(i) =='R' && ans.charAt(ans.length()-1) == '-')ans+="\\";
				else if(program.charAt(i) =='R' && ans.charAt(ans.length()-1) == '\\')ans+="|";
				///////////////////////////////////////////////////////////////////////////
				if(program.charAt(i) =='S')ans+=ans.charAt(ans.length()-1);
				///////////////////////////////////////////////////////////////////////////
			    if(program.charAt(i) =='F' && ans.charAt(ans.length()-1) == '|')ans+="-";
			    else if(program.charAt(i) =='F' && ans.charAt(ans.length()-1) == '-')ans+="|";
			    else if(program.charAt(i) =='F' && ans.charAt(ans.length()-1) == '/')ans+="\\";
			    else if(program.charAt(i) =='F' && ans.charAt(ans.length()-1) == '\\')ans+="/";
				///////////////////////////////////////////////////////////////////////////			
					}
				if(count < sec.length-1)count++;
				}
		}
		return ans;
	}
}
