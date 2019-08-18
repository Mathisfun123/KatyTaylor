import java.applet.*; import java.awt.*;
public class applettime extends Applet{
   public void paint(Graphics g){
      for(int x= 10; x<400; x+=30){
         for(int y= 10; y<400;y+=30){
            g.drawRect(x,y,30,30);
            for(double d = 0; d<100; d+=.00001){
            }
         }
      }
      g.setColor(Color.white);
      g.fillRect(0,0,1600,1600);
      g.setColor(Color.black);
      for(int x = 10; x<400; x+=30){
         for(int y = 10; y<400; y+=30){
            g.drawImage(getImage(getDocumentBase(),"arthur.png"),100,30,30,30,this);
            for(double d = 0; d<100; d+=.00001){}
         }
      }
   // for(int x= 10; x<400; x+=30)
   //    for(int y= 10; y<400;y+=30)
   //         g.drawImage(getImage(getDocumentBase(),"arthur.png"),100,30,30,30,this);
   //         for(double d = 0; d<100; d+=.00001){}
   
   }
}  
 
