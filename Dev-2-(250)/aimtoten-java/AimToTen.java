public class AimToTen {
	public int need(int[] marks) {
		int ans=0;int count=marks.length;
		double avg=0,sum=0;
		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];
		}
		avg=sum/count;
		while(avg < 9.5)
		{
		    sum+=10;
		    avg=sum/++count;
		    ans++;
		}
		return ans;
	}
}
