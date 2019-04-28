package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class RedDot
{
    UI ui;
    private float radius = 20;
    private int x;
    private int y;
    private int pos;
    private int type; //1 is for Shadowhunters, 2 is for Demons, 3 is for Downworlders, 4 is for Runes
    PImage pic;

    public RedDot(UI ui,int type, int x, int y, int pos)
    {
        this.ui = ui;
        this.type = type;
        this.x = x;
        this.y = y;
        this.pos = pos;
    }

    public void render()
    {
        ui.pushMatrix();
        ui.noStroke();
        ui.fill(255,0,0);
        ui.ellipse(x,y, radius, radius);
        ui.popMatrix();
    }

}