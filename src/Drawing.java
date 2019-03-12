import java.awt.*;
import java.applet.*;

public class Drawing extends Applet
{
    public void init(){
        setSize(1440,900);
    }
    public void paint(Graphics g)
    {
        //           g.setSize(10000,10000);
        g.drawRect(10,10,980,640);
        g.setColor(Color.green);
        int begx=10;
        int begy=10;
        //Start Bottom Left

        for(int endx=10;endx<990;endx=endx+20){
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if (begy<640)
                begy=begy+15;
            g.drawLine(begx,begy,endx,650);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }

        }
        //End Bottom Left

        //Start Bottom right
        begx=990;
        begy=10;
        for(int endx=990;endx>10;endx=endx-20) {
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy<640)
                begy=begy+14;
            g.drawLine(begx,begy,endx,650);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }

        }
        //End Bottom Right

        //Start Top Right
        begx=990;
        begy=650;
        for(int endx=940;endx>10;endx=endx-20) {
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy>10)
                begy=begy-15;
            g.drawLine(begx,begy,endx,10);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }

        //Start Top Left
        begx=10;
        begy=640;
        for(int endx=10;endx<=940;endx=endx+20){
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy>10)
                begy=begy-15;
            g.drawLine(begx,begy,endx,10);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }

        //Inside Rectangle
        g.setColor(Color.blue);
        g.drawRect(239,149,495,364);

        //Inside Start Bottom Left
        begx=239;
        begy=149;
        for(int endx=239;endx<=734;endx=endx+10){
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if (begy<=600)
                begy=begy+7;
            g.drawLine(begx,begy,endx,513);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }
        //End Inside Bottom Left
        //Start Inside Bottom Right
        begx=734;
        begy=149;
        for(int endx=730;endx>=239;endx=endx-10) {
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy<=600)
                begy=begy+7;
            g.drawLine(begx,begy,endx,513);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }

        //Start Inside Top Left
        begx=239;
        begy=510;
        for(int endx=241;endx<=734;endx=endx+10){
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy>=149)
                begy=begy-7;
            g.drawLine(begx,begy,endx,149);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }
        //End Inside Top Left
        //Start Inside top Right
        begx=734;
        begy=510;
        for(int endx=740;endx>=239;endx=endx-10) {
            int R= (int)(Math.random()*256);
            int G= (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color randomColor = new Color(R,G,B);
            g.setColor(randomColor);
            if(begy>=147)
                begy=begy-7;
            g.drawLine(begx,begy,endx,149);
            try{
                Thread.sleep(250);
            }catch(Exception e ){
            }
        }

    }
}
