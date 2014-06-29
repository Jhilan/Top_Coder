public class MarbleNecklace {

	public String normalize(String necklace) {
		
		
		String ans=necklace;
		
		
		for (int i = 0; i < necklace.length(); i++) {
			necklace = necklace.substring(1)+necklace.charAt(0);
			if(ans.compareTo(necklace) > 0){ans = necklace;}
		} 
		
			
		 necklace= new StringBuffer(necklace).reverse().toString();
			
			
			for (int i = 0; i < necklace.length(); i++) {
				 necklace = necklace.substring(1)+necklace.charAt(0);
				if(ans.compareTo(necklace) > 0){ans = necklace;}
		}
			return ans;
	}

	}
