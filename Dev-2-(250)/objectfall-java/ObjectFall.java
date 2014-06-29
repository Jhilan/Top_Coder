public class ObjectFall {
	public static int howLong(int x, int y, String[] obstacles) {
		 int t=0;
		 for (int j= y; j > 0;j--) {
		 for (int i = 0; i < obstacles.length; i++) {
			String [] obst = obstacles[i].split(" ");
	if((x >= Integer.parseInt(obst[1])) && (x <= Integer.parseInt(obst[2])) && (j == Integer.parseInt(obst[0])))
			{
				t+=5;
				x=Integer.parseInt(obst[2]);
			}
		}}
		return y+t;
	}
}
