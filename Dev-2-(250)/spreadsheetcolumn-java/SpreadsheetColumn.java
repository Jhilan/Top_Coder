import java.util.LinkedList;
public class SpreadsheetColumn {
	public String getLabel(int column) {
		LinkedList <String> all=new LinkedList<String>();
		String ans="";
		for (int i =1 ; i <= 26; i++) {
			all.add(String.valueOf((char)(i+64)));
		}
		for (int i = 1; i <= 26; i++) {
			for (int j = 1; j <= 26; j++) {
				all.add(String.valueOf((char)(i+64))+String.valueOf((char)(j+64)));
			}
		}
		for (int i = 0; i <= all.size(); i++) {
			if(column == i)ans=all.get(i-1);
		}
		return ans;
	}
}
