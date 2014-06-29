import java.util.Collections;
import java.util.LinkedList;

public class TeamsSelection {
	public static String simulate(int[] preference1, int[] preference2) {
		
		LinkedList<String> first = new LinkedList<String>();
		LinkedList<String> second = new LinkedList<String>();
		
		String result="";
		for(int i =0; i< preference1.length; i ++)
		{
			if(!second.contains(String.valueOf(preference1[i])) && !first.contains(String.valueOf(preference1[i]))    )
			{
			first.add(String.valueOf(preference1[i]));
			}
			
			else { 
				if(i < preference1.length-1){
				first.add(String.valueOf(preference1[i+1]));
				}
				
			}
			
			if(!first.contains(String.valueOf(preference2[i])) && !second.contains(String.valueOf(preference2[i])))
			{	
			second.add(String.valueOf(preference2[i]));
			}
			
			
			else{
				if(i < preference1.length-1){
				second.add(String.valueOf(preference2[i+1]));
				}
			}
			
		}
		
		LinkedList <Integer> sorted = new LinkedList<Integer>();
		for(int i : preference1)
		{
			sorted.add(i);
		}
		Collections.sort(sorted);
		
		for (int i = 0; i < sorted.size(); i++) {
			if(first.contains(String.valueOf(sorted.get(i))))
			{result+="1";}
			
			else
			{result+="2";}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int f[]={3,2,1};
		int s[]={1,3,2};
		
		String r = simulate(f, s);
		System.out.println(r);
	}
	

}
