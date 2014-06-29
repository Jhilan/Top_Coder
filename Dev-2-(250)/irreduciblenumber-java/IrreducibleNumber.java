import java.util.Collections;
import java.util.LinkedList;

public class IrreducibleNumber {
	public int getIrreducible(int[] A) {
		
		LinkedList <Integer> all= new LinkedList<Integer>();
		for(int x : A){ all.add(x);}
		Collections.sort(all);
	     int count=0;
		
		if(A.length == 1 && A[0] == 1){return 2;}
		if(A.length == 1 && A[0] > 1){return 1;}
		
		if(A.length == 2){
		all.add(all.get(0)+all.get(1));}
		
		if(A.length == 3){
		all.add(all.get(0)+all.get(1));
		all.add(all.get(1)+all.get(2));
		all.add(all.get(0)+all.get(2));
		all.add(all.get(0)+all.get(1)+all.get(2));}
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < all.size(); j++) {
				if(i != all.get(j))count++;
			}
			if(count == all.size()){ return i;}
			if(count != all.size()){count=0;}
		}
		return 0;
	}
}
