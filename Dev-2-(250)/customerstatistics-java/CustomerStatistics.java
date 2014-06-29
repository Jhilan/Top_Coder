import java.util.ArrayList;
import java.util.Collections;
public class CustomerStatistics {
	public String[] reportDuplicates(String[] customerNames) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < customerNames.length; i++) {
			String temp = customerNames[i];
			int count=0;
			for (int j = 0; j < customerNames.length; j++) {
				if(temp.equals(customerNames[j]))count++;
			}
			String input=customerNames[i]+" "+count;
			if(count > 1 && !result.contains(input))result.add(input);
		}
		 
		Collections.sort(result);
		String [] ans=new String[result.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=result.get(i);
		}

		return ans;
	}
}
