package kai;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * Created by pavan on 30/09/16.
 */
public class MyApplet extends PApplet {
    private String url = "https://processing.org/img/processing-web.png";
    private PImage backgroundImage;
    public void setup() {
        size(200,200);
        backgroundImage = loadImage("palmTrees.jpg", "jpg");
    }
    public void draw(){
        image(backgroundImage,0,0);
        backgroundImage.resize(0,height);
        int color[] = getColorFromTime(second());
        System.out.println(color[0] + "  " + color[1]);
        fill(color[0],color[1],color[2]);
        ellipse(width/4,height/5,width/5,height/5);
    }

    private int[] getColorFromTime(int second) {
        int rgb[] = new int[3];
        float diffFrom30  = Math.abs(30-second);
        float ratio = diffFrom30/30;
        rgb[0] = (int)(255*ratio);
        rgb[1] = (int)(255*ratio);
        rgb[2] = 0;
        return rgb;
    }
    //new Mac !!
}
