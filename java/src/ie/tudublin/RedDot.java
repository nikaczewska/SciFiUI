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
    int TextX = 500;
    int TextY = 600;
    int gap = 20;

    int width1 = 150;
    int height1 = 140;
    private int type; //1 is for Shadowhunters, 2 is for Demons, 3 is for Downworlders, 4 is for Runes
    PImage pic;

    int click;

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

    public void mouseClicked()
    {
        if(ui.mouseX > x - radius/2 && ui.mouseX < x + radius/2 && ui.mouseY > y - radius/2 && ui.mouseY < y + radius/2)
        {
            if(ui.mouseY > y - radius && ui.mouseY < y + radius)
            {
                if(type == 1)
                {
                    ui.fill(0);
                    ui.rect(ui.width- 988, ui.height - 250, ui.width - 295, ui.height - 660);
                    ui.image(ui.shadowhunters.get(pos).shadowhunter, ui.width - 988, ui.height - 250, width1,height1);
                    ui.textAlign(PApplet.LEFT,PApplet.LEFT);
                    ui.fill(255);
                    ui.text(("Name: " + ui.shadowhunters.get(pos).name), TextX, TextY);
                    ui.text(("Class: " + ui.shadowhunters.get(pos).type), TextX, TextY + gap);
                    ui.text(("Location: " + ui.shadowhunters.get(pos).location), TextX, TextY + (gap*2));
                }

                if(type == 2)
                {
                    ui.fill(0);
                    ui.rect(ui.width- 988, ui.height - 250, ui.width - 295, ui.height - 660);
                    ui.image(ui.demons.get(pos).demon, ui.width - 988, ui.height - 250, width1,height1);
                    ui.stroke(255);
                    ui.textAlign(PApplet.LEFT,PApplet.LEFT);
                    ui.fill(255);
                    ui.text(("Name: " + ui.demons.get(pos).name), TextX, TextY);
                    ui.text(("Class: " + ui.demons.get(pos).type), TextX, TextY + gap);
                    ui.text(("Location: " + ui.demons.get(pos).location), TextX, TextY + (gap*2));
                }
                    
                }

                if(type == 3)
                {
                    ui.fill(0);
                    ui.rect(ui.width- 988, ui.height - 250, ui.width - 295, ui.height - 660);
                    ui.image(ui.downworlders.get(pos).downworlder, ui.width - 988, ui.height - 250, width1,height1);
                    ui.textAlign(PApplet.LEFT,PApplet.LEFT);
                    ui.fill(255);
                    ui.text(("Name: " + ui.downworlders.get(pos).name), TextX, TextY);
                    ui.text(("Class: " + ui.downworlders.get(pos).type), TextX, TextY + gap);
                    ui.text(("Location: " + ui.downworlders.get(pos).location), TextX, TextY + (gap*2));
                }
                
            }
        }
}
