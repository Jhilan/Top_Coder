import java.util.LinkedList;
public class ThreeCardMonte {
	public String position(String swaps) {
      String temp="";
      LinkedList<String> cards= new LinkedList<String>();
		cards.add("J");cards.add("A");cards.add("J");
		for (int i = 0; i < swaps.length(); i++) {
			if(swaps.charAt(i) == 'L'){temp= cards.get(0);cards.set(0, cards.get(1));cards.set(1, temp);}
			if(swaps.charAt(i) == 'R'){temp= cards.get(2);cards.set(2, cards.get(1));cards.set(1, temp);}
			if(swaps.charAt(i) == 'E'){temp= cards.get(0);cards.set(0, cards.get(2));cards.set(2, temp);}
		}
		if(cards.get(0).equals("A"))return "L";
		if(cards.get(1).equals("A"))return "M";
		if(cards.get(2).equals("A"))return "R";
		
		return "M";
	}
}
