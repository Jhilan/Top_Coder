import java.util.LinkedList;
public class grafixClick {
	public static int[] checkSaveButton(int[] mouseRows, int[] mouseCols) {
		LinkedList<Integer> t=new LinkedList<Integer>();
		int count=0;
		for (int i = 0; i < mouseCols.length; i++) {
			if((mouseRows[i] >=20 && mouseRows[i] <= 39 ) && (mouseCols[i] >= 50 && mouseCols[i] <= 99))
				t.add(i);
		}
		int []ans=new int[t.size()];
	    for(int x: t)
	    	{ans[count++]=x;}
		return ans;
	    	}}