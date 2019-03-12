// Lab30st.java
// The Screen Saver Program
// Student Version
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStreamImpl;
import javax.sound.sampled.spi.AudioFileReader;
import javax.swing.JOptionPane;
import java.util.Queue;

import static java.awt.image.BufferedImage.TYPE_INT_ARGB;

public class lab30prac
{
    public static void main(String args[]) throws IOException
    {
        String circleamt = JOptionPane.showInputDialog("Enter number of circles");
        String circleDiameter = JOptionPane.showInputDialog("Enter Diameter of Circles");
        GfxApp2 gfx = new GfxApp2(Integer.parseInt(circleamt), Integer.parseInt(circleDiameter));
        gfx.setSize(800,600);
        gfx.addWindowListener(new WindowAdapter() {public void
        windowClosing(WindowEvent e) {System.exit(0);}});
        gfx.show();


    }
}
class GfxApp2 extends Frame
{
    private int circleCount, circleSize;
    public GfxApp2(int circleAmt1, int circleDia)
    {
        circleCount = circleAmt1;
        circleSize = circleDia;
    }
    class Coord
    {
        private int xPos;
        private int yPos;
        public Coord(int x, int y)
        {
            xPos = x;
            yPos = y;
        }
    }

    public void paint(Graphics g)
    {

        int incX = 40;
        int incY = 40;
        int diameter = circleSize;
        int timeDelay = 10;
        Queue<Coord> q = new LinkedList<>();
        Circle3 c = new Circle3(g,diameter,incX,incY,timeDelay);
        for (int k = 1; k <= circleCount; k++)
        {
            q.add(new Coord(c.getTlX(),c.getTlY()));
            if(q.size()>=50){
              Coord p= q.remove();
                Color color= new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
                g.setColor(color);
             // g.fillRect(0,0,getWidth(),getHeight());
              g.setColor(Color.WHITE);
              //g.fillRect(p.xPos,p.yPos,50,50);
            }
            Queue <Coord> temp = new LinkedList<>();
            while(!q.isEmpty()){
                Coord redraw = q.poll();
                c.hitEdge();
                c.drawCircle(g);
                c.drawPast(g,c.getTlX(),c.getTlY());
                temp.add(redraw);
            }
            //g.fillRect(0,0,getWidth(),getHeight());
            while(!temp.isEmpty()){

                    q.add(temp.poll());
            }
           // c.drawCircle(g);
            //c.hitEdge();
        }
    }
}


class Circle3
{
    private int tlX; // top-left X coordinate
    private int tlY; // top-left Y coordinate
    private int incX; // increment movement of X coordinate
    private int incY; // increment movement of Y coordinate
    private boolean addX; // flag to determine add/subtract of increment for X
    private boolean addY; // flag to determine add/subtract of increment for Y
    private int size; // diameter of the circle
    private int timeDelay; // time delay until next circle is drawn

    public Circle3(Graphics g, int s, int x, int y, int td)
    {
        incX = x;
        incY = y;
        size = s;
        addX = true;
        addY = false;
        tlX = 400;
        tlY = 300;
        timeDelay = td;
    }

    public void delay(int n)
    {
        long startDelay = System.currentTimeMillis();
        long endDelay = 0;
        while (endDelay - startDelay < n)
            endDelay = System.currentTimeMillis();
    }
    public void drawCircle(Graphics g)
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("1080p.png"));
        } catch (IOException e) {
        }
        img = scale(img,size,size);
        hitEdge();
        g.drawImage(img,tlX,tlY,null);
       // drawPast(g,tlX,tlY);
        if(Math.random()*2!=1){
            Color color;
            Random random = new Random();
            float hue = random.nextFloat();
            float saturation = 1.0f;
            float luminance = 1.0f;
            color = Color.getHSBColor(hue, saturation, luminance);
            //g.setColor(color);
        }
        //  g.drawOval(tlX,tlY,size,size);

        if (addX)
            tlX+=incX;
        else
            tlX-=incX;
        if (addY)
            tlY+=incY;
        else
            tlY-=incY;
    }
    public static BufferedImage scale(BufferedImage imageToScale, int dWidth, int dHeight) {
        BufferedImage scaledImage = null;
        if (imageToScale != null) {
            scaledImage = new BufferedImage(dWidth, dHeight, imageToScale.getType());
            Graphics2D graphics2D = scaledImage.createGraphics();
            graphics2D.drawImage(imageToScale, 0, 0, dWidth, dHeight, null);
            graphics2D.dispose();
        }
        return scaledImage;
    }
    public void drawPast(Graphics g , int x, int y){

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("image2.jpeg"));
        } catch (IOException e) {
        }
        img = scale(img,size,size);
        hitEdge();
        g.drawImage(img,x,y,null);
        try{
            Thread.sleep(100);
        }catch(Exception e){
        }
    }

    public void newData()
    {
        incX = (int) Math.round(Math.random() * 30 + 5);
        incY = (int) Math.round(Math.random() * 30 + 5);
    }
    public void hitEdge()
    {
        boolean flag = false;
        if (tlX < incX)
        {
            addX = true;
            flag = true;
        }
        if (tlX > 800 - (30 + incX))
        {
            addX = false;
            flag = true;
        }
        if (tlY < incY + 30) // The +30 is due to the fact that the title bar covers the top 30 pixels of the window
        {
            addY = true;
            flag = true;
        }
        if (tlY > 600 - (30 + incY))
        {
            addY = false;
            flag = true;
        }
        if (flag)
            newData();
    }
    public int getTlX(){return tlX;}
    public int getTlY() {return tlY;};

}