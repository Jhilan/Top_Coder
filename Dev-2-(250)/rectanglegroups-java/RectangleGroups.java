import java.util.SortedSet;
import java.util.TreeSet;
public class RectangleGroups {
	public String maximalIndexed(String[] rectangles) {
		String ans="";
		int count=0;int max=Integer.MIN_VALUE;
		SortedSet<String> group =new TreeSet<String>();
		for (int i = 0; i < rectangles.length; i++) {
			group.add(String.valueOf(rectangles[i].charAt(0)));
		}
		String []G=new String[group.size()];
		int []G_count=new int[G.length];
		for (String x : group) {
			G[count++]=x;
		}
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < rectangles.length; j++) {
				if(rectangles[j].startsWith(G[i]))
				{
					String [] div=rectangles[j].split(" ");
					G_count[i]+=Integer.parseInt(div[1])*Integer.parseInt(div[2]);
				}
			}
		}
		for (int i = 0; i < G_count.length; i++) {
			if(max < G_count[i])max=G_count[i];
		}
		for (int i = 0; i < G_count.length; i++) {
			if(max == G_count[i])
				{ans+=G[i]+" "+G_count[i];
				return ans;
				}
		}
		return ans;
	}
}
