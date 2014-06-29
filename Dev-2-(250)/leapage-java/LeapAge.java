public class LeapAge {
	public static int getAge(int year, int born) {
		int ans=0;
		for (int i = born+1; i <= year; i++) {
			if(i % 4 == 0 && !(i % 100 == 0 && i% 400 != 0))ans++;
		}
return ans;
	}
	public static void main(String[] args) {
		int year=2004,born=1980;
		System.out.println(getAge(year, born));
		System.out.println(1900 %4);
	}
}
