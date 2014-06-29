import java.util.LinkedList;
public class Segments {
	public static String intersection(int[] s1, int[] s2) {
		String axis ="";  int ans =0,max=0,min=0;
		LinkedList<String> F = new LinkedList<String>();
		LinkedList<String> S = new LinkedList<String>();
		if(s1[0] == s1[2] ) axis="y";
		if(s1[1] == s1[3] ) axis="x";
		
		if((s1[0] == s1[2]) && (s1[1] == s1[3]) && (s2[0] == s2[2]) && (s2[1] == s2[3])
				&& s1[0] == s2[0] && s1[1] == s2[1] && s1[2] == s2[2] && s1[3] == s2[3])return "POINT";
		if((s1[0] == s1[2]) && (s1[1] == s1[3]) && (s2[0] == s2[2]) && (s2[1] == s2[3]))return "NO";
		if(axis.equals("y"))
		{   
		       max = Math.max(s1[1], s1[3]);
			   min = Math.min(s1[1],s1[3]);
			for (int i = min; i <= max; i++) {
				F.add(String.valueOf(s1[0])+","+String.valueOf(i));
			}
		}
		if(axis.equals("x"))
		{
		        max = Math.max(s1[0], s1[2]);
			    min = Math.min(s1[0],s1[2]);
			for (int i = min; i <= max; i++) {
				F.add(String.valueOf(i)+","+String.valueOf(s1[1]));
			}
		}
		//////////////////////////////////// line 2
		String axis2="";
		if(s2[0] == s2[2]) axis2="y";
		if(s2[1] == s2[3]) axis2="x";
		
		if(axis2.equals("y"))
		{
		    max = Math.max(s2[1], s2[3]);
			   min = Math.min(s2[1],s2[3]);
			for (int i = min; i <= max; i++) {
				S.add(String.valueOf(s2[0])+","+String.valueOf(i));
			}
		}
		if(axis2.equals("x"))
		{
			max = Math.max(s2[0], s2[2]);
		    min = Math.min(s2[0],s2[2]);
			for (int i = min; i <= max; i++) {
				S.add(String.valueOf(i)+","+String.valueOf(s2[1]));
			}
		}
		for (int i = 0; i < F.size(); i++) {
			for (int j = 0; j < S.size(); j++) {
				if(F.get(i).equals(S.get(j)))ans++;
			}
		}
		if(ans == 1) return "POINT";
		if(ans > 1) return "SEGMENT";
		
	return "NO";
	}
}
