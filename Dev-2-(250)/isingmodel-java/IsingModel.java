public class IsingModel {
	public static int energy(String[] spins) {
		int ans=0;
		if(spins.length == 1 && spins[0].length() == 1)return 0;
		for (int i = 0; i < spins.length; i++) {
			for (int j = 1; j < spins[i].length(); j++) {
				if(spins[i].charAt(j-1) != spins[i].charAt(j))ans+=1;
				if(spins[i].charAt(j-1) == spins[i].charAt(j))ans+=(-1);
			}
		}
		for (int i = 1; i < spins.length; i++) {
			for (int j = 0; j < spins[i].length(); j++) {
				if(spins[i].charAt(j) != spins[i-1].charAt(j))ans+=(1);
				if(spins[i].charAt(j) == spins[i-1].charAt(j))ans+=(-1);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String[] spins= {"++-+--++-+-+--+++--+-+-"};
		System.out.println(energy(spins));
	}
}
