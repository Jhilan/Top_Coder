import java.util.logging.Handler;

public class CountGame {
	public static int howMany(int maxAdd, int goal, int next) {
		return ((goal-next +1) % (maxAdd+1) == 0	)? -1 : (goal-next +1) % (maxAdd+1);
	}
public static void main(String[] args) {
	int maxAdd=3, goal=20 , next=10;
	System.out.println(howMany(maxAdd, goal, next));
}
}
