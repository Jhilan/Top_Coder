public class ChatTranscript {
	public int howMany(String[] transcript, String name) {
		int ans=0;
		  String x=name+":";
		for (int i = 0; i < transcript.length; i++) {
			if(transcript[i].startsWith(x))ans++;
		}
	return ans;
	}
}
