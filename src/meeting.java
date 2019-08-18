import java.applet.Applet;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class meeting extends Applet {
	@Override
	public void paint(Graphics g) {
		int ct = 0;
		int beg = (int)(Math.random() * 300);
		while(ct<5) {
			ct++;
			if(beg> 300){
				beg= 0;
			}
			int end = (int)(Math.random()*(400-beg)) + beg;

			for (int i=beg,j = beg ; i < end; i += 10, j+=(int)(Math.random()*10)) {
				g.drawOval(i, j, 10, 10);
				delay();
			}
			beg = end;

		}
	}
	public static void delay(){
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
