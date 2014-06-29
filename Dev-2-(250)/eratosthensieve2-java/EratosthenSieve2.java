import java.util.LinkedList;
public class EratosthenSieve2 {
	public int nthElement(int n) {
		LinkedList<Integer> all = new LinkedList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			all.add(i);
		}
		for (int i = 2; i <= 10; i++) {		
			if(i == 2)
			{
				  for (int k = i-1; k < all.size(); k+=2) {				 
					     all.set(k, 6666);
						}
			}		
			if(i != 2){
		  for (int k = i-1; k < all.size(); k+=i) {
			  all.set(k, 6666);
		}}
		  
			for (int j = 0; j < all.size(); j++) {
				if(all.get(j) == 6666)all.remove(j);
			}	
		}
	return all.get(n-1);
	}
}
