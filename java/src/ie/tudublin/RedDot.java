package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class RedDot
{
    UI ui;
    private float x;
    private float y;
    private float radius;
    private int type; //1 is for Shadowhunters, 2 is for Demons, 3 is for Downworlders, 4 is for Runes
    PImage pic;

    public RedDot(UI ui, float x, float y, float radius,int type, PImage pic)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.type = type;
        this.pic = pic;
    }

    public void render()
    {
        
    }
}