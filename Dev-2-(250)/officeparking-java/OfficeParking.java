import java.util.HashSet;
import java.util.Set;

public class OfficeParking {

	public int spacesUsed(String[] events) {
		int ans=0;
		Set<String> all=new HashSet<String>();
		for(String x : events){
		String key=x.split(" ")[0];
		if(all.contains(key))all.remove(key);
		else{all.add(key);}
		ans=Math.max(ans, all.size());
		}
		return ans;
	}
}
