import java.applet.*;

import java.applet.Applet;

public class Sound {
    private AudioClip clip;
    public static final Sound sound1 = new Sound("HiMusic.mp4");
    public Sound(String fileName){
        try{
            clip = Applet.newAudioClip(Sound.class.getResource(fileName));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void play(){
        try{
            run();

        }catch (Exception e){

        }
    }
    public void run(){
        clip.play();
    }
}
