import java.util.*;

import static java.lang.System.*;
public class LearningClasses {
	static CHall input = new CHall();

	public static void main(String[] args) {
		String p = "journey"; int c = 0;
		for (int i = 0; i < p.length(); i++) {
			if("physics".indexOf(p.charAt(i))>1){
				c++;
			}
		}
		out.println(c++);


	}
}

class CHall extends DHall{
	int r = 2; int r2= 1;
}
class DHall{
	int r = 1;
	public boolean connected(int r1, int r2){
		return Math.abs(r-r1)<=2&& Math.abs(r2-r)<=2;
	}
}
