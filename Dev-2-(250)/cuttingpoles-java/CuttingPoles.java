import java.util.Collections;
import java.util.LinkedList;
public class CuttingPoles {
	public int countCuts(int[] poles) {
		int ans=0;
		LinkedList<Integer> pol= new LinkedList<Integer>();
		for (int i = 0; i < poles.length; i++) {
			pol.add(poles[i]);
			
		}
		while(is_even(pol) == false)
		{
			int avg=0;
			for (int i = 0; i < pol.size(); i++) {
				avg+=pol.get(i);
			}
			avg/=poles.length;
			
			Collections.sort(pol);
			Collections.reverse(pol);
			
			int cut = pol.get(0)-avg;
			pol.set(pol.size()-1,  pol.get(pol.size()-1)+cut);
			pol.set(0,  avg);
			++ans;
		}
		return ans;
	}
  public static boolean is_even(LinkedList<Integer> poles)
  {
	  int count=0;int value=poles.get(0);
	  for (int i = 0; i < poles.size(); i++) {
		if(value == poles.get(i))count++;
	}
	  if(count == poles.size()){return true;}
	  return false;
  }
}
