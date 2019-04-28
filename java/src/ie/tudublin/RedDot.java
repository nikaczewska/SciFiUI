package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class RedDot
{
    UI ui;
    private float x;
    private float y;
    private float radius = 20;
    private int type; //1 is for Shadowhunters, 2 is for Demons, 3 is for Downworlders, 4 is for Runes
    PImage pic;

    public RedDot(UI ui,int type)
    {
        this.ui = ui;
        this.type = type;
        this.pic = pic;
    }

    public void render()
    {
        ui.pushMatrix();
        ui.noStroke();
        ui.fill(255,0,0);
        ui.ellipse(250,250, radius, radius);
        ui.popMatrix();
    }

    public void mouseClicked()
    {
        if(ui.mouseX )

    }
}