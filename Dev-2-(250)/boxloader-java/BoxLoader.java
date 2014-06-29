public class BoxLoader {
	public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
	int ans=0;
		ans=Math.max(ans, (boxX/itemX)*(boxY/itemY)*(boxZ/itemZ));
		ans=Math.max(ans, (boxX/itemX)*(boxY/itemZ)*(boxZ/itemY));
		ans=Math.max(ans, (boxX/itemZ)*(boxY/itemY)*(boxZ/itemX));
		ans=Math.max(ans, (boxX/itemZ)*(boxY/itemX)*(boxZ/itemY));
		ans=Math.max(ans, (boxX/itemY)*(boxY/itemX)*(boxZ/itemZ));
		ans=Math.max(ans, (boxX/itemY)*(boxY/itemZ)*(boxZ/itemX));
    return ans;
	}
}
