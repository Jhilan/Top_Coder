import java.util.LinkedList;
public class Truckloads {
	public static int numTrucks(int numCrates, int loadSize) {
	/*	LinkedList<Integer> r=new LinkedList<Integer>();
		int first=numCrates/2;
		int second=numCrates-first;
		
			if(first <= loadSize)r.add(first);
			if(second <= loadSize)r.add(second);
			
			if(first > loadSize){count(first, loadSize,r);}
			if(second > loadSize){count(second, loadSize,r);}
		
		return r.size();
	}
	public static LinkedList<Integer> count(int numCrates, int loadSize,LinkedList<Integer> all) {
		
		int first=numCrates/2;
		int second=numCrates-first;
		
			if(first <= loadSize)all.add(first);
			if(second <= loadSize)all.add(second);
			
			if(first > loadSize){count(first, loadSize,all);}
			if(second > loadSize){count(second, loadSize,all);}
		
		return all;
	}  */
		if(numCrates <= loadSize){ return 1;}
		return numTrucks(numCrates/2, loadSize) +numTrucks( (numCrates+1)/2,  loadSize);
	}
}
