package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Demon
{
    UI ui;
    private float x;
    private float y;
    private float radius;
    PImage demon;

    public Demon(UI ui, float x, float y, float radius, PImage demon)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.demon = demon;

    }

    public void render()
    {
        ui.fill(255,0,0);
        ui.ellipse(x,y,radius,radius);
    }

    public void mouseClicked()
    {
        
    }
}