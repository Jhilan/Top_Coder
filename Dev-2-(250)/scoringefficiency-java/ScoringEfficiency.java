public class ScoringEfficiency {
	public static double getPointsPerShot(String[] gameLog) {
		double ans=0.0;
		int count=0,field=0,fthrow=0;
		for (int i = 0; i < gameLog.length; i++) {
			if(gameLog[i].contains("2") && gameLog[i].contains("Made"))count+=2;
			if(gameLog[i].contains("3") && gameLog[i].contains("Made"))count+=3;
			if(gameLog[i].contains("free") && gameLog[i].contains("Made"))count+=1;
			if(gameLog[i].contains("point") && gameLog[i].contains("field") && gameLog[i].contains("goal"))field++;
			if(gameLog[i].contains("free") && gameLog[i].contains("throw"))fthrow++;
		}
		ans=count/(field+(0.5*fthrow));
		return ans;
	}
}
