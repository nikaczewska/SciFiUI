package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class NYCMap
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private PImage nyc;

    public NYCMap(UI ui, float x, float y, float width, float height, PImage nyc)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.nyc = nyc;

    }

    public void render()
    {
        ui.pushMatrix();
        ui.image(nyc, x, y, width, height);
        ui.popMatrix();

    }
}