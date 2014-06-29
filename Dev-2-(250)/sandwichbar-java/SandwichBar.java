import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
	    Set<String> in = new HashSet<String>(Arrays.asList(available));
	    String[] ing=new String[in.size()];
	    int count=0;
	    for (String x : in) {
			ing[count++]=x;
		}
		for (int i = 0; i < orders.length; i++) {
			int ans=0;
			String []all = orders[i].split(" ");
			for (int j = 0; j < all.length; j++) {
				for (int k = 0; k < ing.length; k++) {
					if(all[j].equals(ing[k]))ans++;
				}
			}
			if(ans >= all.length)return i;
		}
		return -1;
	}
}
