import java.util.LinkedList;

public class MovingAverages {
	public static int[] calculate(String[] times, int n) {
		LinkedList<Integer> all=new LinkedList<Integer>();
		for (int i = 0; i <= times.length-n; i++) {
			int count=0,avg=0;
			for (int j = i; j < n+i; j++) {
			String []t=times[j].split(":");
		     int seconds= (Integer.parseInt(t[0])*3600)+ (Integer.parseInt(t[1])*60)+Integer.parseInt(t[2]);
			count+=seconds;
			}
			avg=count/n;
			all.add(avg);
		}
		int[] ans=new int[all.size()];
		int z=0;
		for(int x: all)
			ans[z++]=x;
		return ans;
	}

}
