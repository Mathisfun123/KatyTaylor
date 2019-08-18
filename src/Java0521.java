import java.applet.*;
import java.awt.*;
import java.util.ArrayList;

public class Java0521 extends Applet{

	public void paint (Graphics g){
		reset(g);
		for(int i = 0; i< 8; i++){
			if(i==0){
				drawRow(0,25,i,g);
			}else{
				drawRow(30, ((i+1)*50)-25, i, g);
			}
		}
//		ArrayList<Integer> pointstillhitfirst = new ArrayList<>();
//		for(int i = 0; i< 370; i+=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),25,pointstillhitfirst.get(pointstillhitfirst.size()-1),25);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(370,25,370, 75); pointstillhitfirst.clear();
//		for(int i = 370; i>= 30; i-=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),75,pointstillhitfirst.get(pointstillhitfirst.size()-1),75);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(30,75,30, 125); pointstillhitfirst.clear();
//		for(int i = 30; i< 370; i+=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),125,pointstillhitfirst.get(pointstillhitfirst.size()-1),125);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(370,125,370, 175); pointstillhitfirst.clear();
//		for(int i = 370; i>= 30; i-=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),175,pointstillhitfirst.get(pointstillhitfirst.size()-1),175);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(30,175,30, 225); pointstillhitfirst.clear();
//		for(int i = 30; i< 370; i+=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),225,pointstillhitfirst.get(pointstillhitfirst.size()-1),225);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(370,225,370, 275); pointstillhitfirst.clear();
//		for(int i = 370; i>= 0; i-=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),275,pointstillhitfirst.get(pointstillhitfirst.size()-1),275);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(30,275,30, 325); pointstillhitfirst.clear();
//		for(int i = 30; i< 370; i+=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),325,pointstillhitfirst.get(pointstillhitfirst.size()-1),325);
//			delay();
//			reset(g);
//		}
//		delay();
//		g.setColor(Color.red); g.drawLine(370,325,370, 375); pointstillhitfirst.clear();
//		for(int i = 370; i>= 0; i-=5){
//			pointstillhitfirst.add(i);
//			while(pointstillhitfirst.size()>10){
//				pointstillhitfirst.remove(0);
//			}
//			g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),375,pointstillhitfirst.get(pointstillhitfirst.size()-1),375);
//			delay();
//			reset(g);
//		}
	}
	public static void drawRow(int r, int c, int factor, Graphics g){
		ArrayList<Integer> pointstillhitfirst = new ArrayList<>();
		if(factor%2==0) {
			for (int i = r; i < 370; i += 5) {
				pointstillhitfirst.add(i);
				while (pointstillhitfirst.size() > 10) {
					pointstillhitfirst.remove(0);
				}
				g.setColor(Color.red);
				g.drawLine(pointstillhitfirst.get(0), c, pointstillhitfirst.get(pointstillhitfirst.size() - 1), c);
				delay();
				reset(g);
			}
			delay();
			g.setColor(Color.red);
			g.drawLine(370, c, 370, c+50);
		}else{
			for(int i = 370; i>= c; i-=5){
				pointstillhitfirst.add(i);
				while(pointstillhitfirst.size()>10){
					pointstillhitfirst.remove(0);
				}
				g.setColor(Color.red); g.drawLine(pointstillhitfirst.get(0),c,pointstillhitfirst.get(pointstillhitfirst.size()-1),c);
				delay();
				reset(g);
			}
			delay();
			if(factor!=7) {
				g.setColor(Color.red);
				g.drawLine(30, c, 30, c+50);
				pointstillhitfirst.clear();
			}
		}
	}
	public static void delay(){
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void reset(Graphics g){
		g.setColor(Color.white); g.fillRect(0,0,400,1600);
		g.setColor(Color.black);
		for(int p = 0; p< 400; p+=50){
			for(int j = 0; j<400; j+=50) {
				g.drawRect(p, j, 50, 50);
			}
		}
	}
}