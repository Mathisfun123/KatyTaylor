import java.applet.*;
import java.awt.*;
import java.util.ArrayList;

public class homework extends Applet{

	public void paint (Graphics g){

		for(int i =0; i< 400; i+=30){
			for(int j = 0; j<300;j+=30){
				g.drawRect(i,j,30,30);
				for(double x = 0; x<100; x+=.00001 ){

				}
			}
		}
		g.setColor(Color.white);
		g.fillRect(0,0,400,400);
		g.setColor(Color.black);
		for(int i =0; i< 400; i+=30){
			for(int j = 0; j<400;j+=30){
				g.drawRect(j,i,30,30);
				for(double x = 0; x<100; x+=.00001 ){

				}
			}
		}
	}
}