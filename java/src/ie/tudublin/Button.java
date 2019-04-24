package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    NYCMap nycMap;
    PImage nyc;
    PImage black;

    public Button(UI ui, float x, float y, float width, float height, String text, PImage nyc, PImage black)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        this.nyc = nyc;
        this.black = black;

        
    }

    int click = 0;
    int type = 0;
	public void render()
    {
        ui.noFill();
        ui.stroke(66,206,244);
        ui.ellipse(x, y, width, width);
        ui.stroke(63,133,255);
        ui.ellipse(x, y, width-10, width-10);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x , y );
        if(click > 0 && click < 4)
        {
            nycMap = new NYCMap(ui, 212, 62, 1200 - 297, 800 - 172, nyc);
            nycMap.render();
        }
    }

    public void mouseClicked()
    {
        if(ui.mouseX > x - width/2 && ui.mouseX < x + width/2 && ui.mouseY > y - width/2 && ui.mouseY < y + width/2)
        {
            if(ui.mouseY > y - width && ui.mouseY < y + width)
            {
                if(text == "Shadowhunters")
                {
                    click = 1;
                    type = 1;
                }

                if(text == "Demons")
                {
                    click = 2;
                    type = 3;
                }

                if(text == "Downworlders")
                {
                    click = 3;
                    type = 2;
                }

                if(text == "Runes")
                {
                    click = 4;
                    type = 4;
                }
               
            }
        }
    }
}