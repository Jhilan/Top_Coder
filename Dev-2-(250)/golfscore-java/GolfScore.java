public class GolfScore {
	public int tally(int[] parValues, String[] scoreSheet) {
		int ans=0;
		for (int i = 0; i < scoreSheet.length; i++) {
			if(scoreSheet[i].equals("triple bogey"))ans+=(parValues[i]+3);
			if(scoreSheet[i].equals("double bogey"))ans+=(parValues[i]+2);
			if(scoreSheet[i].equals("bogey"))ans+=(parValues[i]+1);
			if(scoreSheet[i].equals("par"))ans+=(parValues[i]);
			if(scoreSheet[i].equals("birdie"))ans+=(parValues[i]-1);
			if(scoreSheet[i].equals("eagle"))ans+=(parValues[i]-2);
			if(scoreSheet[i].equals("albatross"))ans+=(parValues[i]-3);
			if(scoreSheet[i].equals("hole in one"))ans+=(1);
		}
		return ans;
	}
}
