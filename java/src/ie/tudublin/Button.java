package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Button
{
    UI ui;
    ArrayList<RedDot> redDots = new ArrayList<RedDot>();
    private float x;
    private float y;
    private float width;
    private String text;
    NYCMap nycMap;
    PImage nyc;


    int mapX = 212;
    int mapY = 62;
    int mapWidth = 1200 - 297;
    int mapHeight = 800 - 172;
    //Dots for Demons
    RedDot DemonDot1;
    RedDot DemonDot2;
    RedDot DemonDot3;
    RedDot DemonDot4;
    RedDot DemonDot5;
    RedDot DemonDot6;
    //Dots for Shadowhunters
    RedDot sDot1;
    RedDot sDot2;
    RedDot sDot3;
    RedDot sDot4;
    RedDot sDot5;
    RedDot sDot6;
    //Dots for Downworlders
    RedDot dDot1;
    RedDot dDot2;
    RedDot dDot3;
    RedDot dDot4;
    RedDot dDot5;
    RedDot dDot6;

    public Button(UI ui, int x, int y, int width, String text, PImage nyc) 
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.text = text;
        this.nyc = nyc;
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
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x , y );
    }

    public void update()
    {
        if(click == 1)
        {
            redDots.clear();
            nycMap = new NYCMap(ui, mapX, mapY, mapWidth, mapHeight, nyc);
            nycMap.render();
            sDot1 = new RedDot(ui,type, 525, 300,0);
            sDot2 = new RedDot(ui, type, 400, 215,1);
            sDot3 = new RedDot(ui, type, 515, 415,2);
            sDot4 = new RedDot(ui, type, 475, 250,3);
            sDot5 = new RedDot(ui, type, 550, 490,4);
            sDot6 = new RedDot(ui, type, 600, 260,5);
           
            redDots.add(sDot1);
            redDots.add(sDot2);
            redDots.add(sDot3);
            redDots.add(sDot4);
            redDots.add(sDot5);
            redDots.add(sDot6);

            sDot1.render();
            sDot2.render();
            sDot3.render();
            sDot4.render();
            sDot5.render();
            sDot6.render();

            sDot1.mouseClicked();
            sDot2.mouseClicked();
            sDot3.mouseClicked();
            sDot4.mouseClicked();
            sDot5.mouseClicked();
            sDot6.mouseClicked();

        }

        if(click == 2)
        {
            redDots.clear();
            nycMap = new NYCMap(ui, mapX, mapY, mapWidth, mapHeight, nyc);
            nycMap.render();
            DemonDot1 = new RedDot(ui, type, 350, 200,0);
            DemonDot2 = new RedDot(ui, type,500, 350,1);
            DemonDot3 = new RedDot(ui, type, 515, 320,2);
            DemonDot4 = new RedDot(ui, type, 675, 400,3);
            DemonDot5 = new RedDot(ui, type, 625, 225,4);
            DemonDot6 = new RedDot(ui, type, 700, 115,5);

            redDots.add(DemonDot1);
            redDots.add(DemonDot2);
            redDots.add(DemonDot3);
            redDots.add(DemonDot4);
            redDots.add(DemonDot5);
            redDots.add(DemonDot6);

            DemonDot1.render();
            DemonDot2.render();
            DemonDot3.render();
            DemonDot4.render();
            DemonDot5.render();
            DemonDot6.render();

            DemonDot1.mouseClicked();
            DemonDot2.mouseClicked();
            DemonDot3.mouseClicked();
            DemonDot4.mouseClicked();
            DemonDot5.mouseClicked();
            DemonDot6.mouseClicked();
            
           
        }

        if(click == 3)
        {
            redDots.clear();
            nycMap = new NYCMap(ui, mapX, mapY, mapWidth, mapHeight, nyc);
            nycMap.render();

            dDot1 = new RedDot(ui,type, 505, 320,0);
            dDot2 = new RedDot(ui, type, 410, 260,1);
            dDot3 = new RedDot(ui, type, 495, 410,2);
            dDot4 = new RedDot(ui, type, 500, 265,3);
            dDot5 = new RedDot(ui, type, 575, 400,4);
            dDot6 = new RedDot(ui, type, 615, 300,5);
           
            redDots.add(dDot1);
            redDots.add(dDot2);
            redDots.add(dDot3);
            redDots.add(dDot4);
            redDots.add(dDot5);
            redDots.add(dDot6);

            dDot1.render();
            dDot2.render();
            dDot3.render();
            dDot4.render();
            dDot5.render();
            dDot6.render();

            dDot1.mouseClicked();
            dDot2.mouseClicked();
            dDot3.mouseClicked();
            dDot4.mouseClicked();
            dDot5.mouseClicked();
            dDot6.mouseClicked();
           
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
                    type = 2;
                }

                if(text == "Downworlders")
                {
                    click = 3;
                    type = 3;
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