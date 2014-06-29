public class SpeedTyper {
	public String lettersToPractice(String letters, int[] times) {
		String ans="";int avg=0;int temp=0,total=0;
		total=times[times.length-1]/times.length;
		for (int i = 0; i < times.length; i++) {
			avg=times[i]-temp;
			temp=times[i];
			if(avg > total)ans+=letters.charAt(i);
		}
		return ans;
	}
}
