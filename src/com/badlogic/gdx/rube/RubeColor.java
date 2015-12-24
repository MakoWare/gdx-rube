package com.badlogic.gdx.rube;

/**
 * Created by Derek Arner on 12/23/15.
 */
public class RubeColor {
    public int red;
    public int green;
    public int blue;
    public int alpha;

    public RubeColor(int[] colorArray){
        this(colorArray[0],colorArray[1],colorArray[2],colorArray[3]);
    }

    public RubeColor(int red, int green, int blue, int alpha){
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return "(" + this.red + "," +  this.green + "," + this.blue + "," + this.alpha + ")";
    }
}
