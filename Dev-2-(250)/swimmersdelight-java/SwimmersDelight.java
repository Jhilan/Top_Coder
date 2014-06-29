public class SwimmersDelight {
	public int longestJump(int[] x, int[] y) {
		int F_s_x=0,S_s_x=0,F_s_y=0,S_s_y=0;
		if(x[0] == x[1]){
			double first= Math.hypot(0-x[0], y[0]-y[0]);
			double second= Math.hypot(x[0]-10, y[0]-y[0]);
			return Math.max((int)first,(int) second);
		}
		 if(x[0] < x[1]){F_s_x=x[0];F_s_y=y[0]; S_s_x=x[1];S_s_y=y[1];}
		 if(x[0] > x[1]){F_s_x=x[1];F_s_y=y[1]; S_s_x=x[0];S_s_y=y[0];}
		 
		 double first_jump= Math.round(Math.hypot(0-F_s_x, F_s_y-F_s_y));  /// shore to first stone
		 double second_jump=Math.round(Math.hypot(F_s_x-S_s_x,F_s_y-S_s_y));    /// first stone to second stone
		 double third_jump= Math.round(Math.hypot(S_s_x-10, S_s_y-S_s_y));    /// second stone to shore 
		 double fourth_jump= Math.round(Math.hypot(F_s_x-10, F_s_y-F_s_y));    /// first stone to shore 
		 double fifth_jump= Math.round(Math.hypot(0-S_s_x, S_s_y-S_s_y));    /// shore to second stone
		 
		 if((fifth_jump < second_jump) && (fifth_jump < fourth_jump)){return (int)Math.max(fifth_jump,third_jump);}
		 if(fourth_jump <second_jump){return (int) Math.max(fourth_jump,first_jump);}
		 
		 double r=Math.max(first_jump, Math.max(second_jump, third_jump));
		 
		 return (int)r;
	}
}
