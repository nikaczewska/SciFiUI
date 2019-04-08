package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button button1;
	Button button2;
	Button button3;
    Button button4;
    NYCMap NycMap;

    PImage AngelicPower;
    PImage rune1;
    PImage rune2;
    PImage rune3;
    PImage rune4;
    PImage rune5;
    PImage rune6;
    PImage rune7;
    PImage rune8;
    PImage rune9;
    PImage nyc;
    PImage demonAbbadon;
    PImage demonBehemoth;
    PImage demonForsaken;
    PImage demonHunger;
    PImage demonRaum;
    PImage demonRavener;
    PImage demonVermithrall;

    int RuneWidth = 80;
    int RuneHeight = 100;


    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1200, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        button3 = new Button(this, 75, 470, 100, 50, "Runes");
        button1 = new Button(this, 75, 70, 100, 50, "Demons");
		button2 = new Button(this, 75, 270, 100, 50, "Downworlders");
        button4 = new Button(this, 75, 670, 100, 50, "Shadowhunters");
		
        AngelicPower = loadImage("Angelic_Power.PNG");
        rune1 = loadImage("Abundance.PNG");
        rune2 = loadImage("Acceleration.PNG");
        rune3 = loadImage("Accuracy.PNG");
        rune4 = loadImage("Action.PNG");
        rune5 = loadImage("Agility.PNG");
        rune6 = loadImage("Agony.PNG");
        rune7 = loadImage("Allied_To.PNG");
        rune8 = loadImage("Courage_In_Combat.PNG");
        rune9 = loadImage("Clarity.PNG");
        nyc = loadImage("NewYork.jpg");
        demonAbbadon = loadImage("Demon_Abbadon.png");
        demonBehemoth = loadImage("Demon_Behemoth.png");
        demonForsaken = loadImage("Demon_Forsaken.png");
        demonHunger = loadImage("Demon_Hunger.png");
        demonRaum = loadImage("Demon_Raum.png");
        demonRavener = loadImage("Demon_Ravener.jpg");
        demonVermithrall = loadImage("Demon_Vermithrall.png");

        NycMap = new NYCMap(this, 212, 62, width - 295, height - 170, nyc);
    }

    public void draw()
    {
        background(0);
        stroke(66,206,244);
        rect(200,50, width - 275, height - 150);
        stroke(63,133,255);
        rect(210,60, width - 295, height - 170);
        NycMap.render();
        image(AngelicPower, width - 200, 70, RuneHeight, RuneHeight);
        image(rune1, 200, height - 90, RuneHeight,RuneWidth);
        image(rune2, 300, height - 90, RuneHeight,RuneWidth);
        image(rune3, 400, height - 90, RuneHeight, RuneWidth);
        image(rune4, 500, height - 90, RuneHeight, RuneWidth);
        image(rune5, 600, height - 90, RuneHeight,RuneWidth);
        image(rune6, 700, height - 90, RuneHeight, RuneWidth);
        image(rune7, 800, height - 90, RuneHeight, RuneWidth);
        image(rune8, 900, height - 90, RuneHeight, RuneWidth);
        image(rune9, 1000, height - 90, RuneHeight, RuneWidth);

        button1.render();
		button2.render();
		button3.render();
        button4.render();
        
        

        //mc.update();
        //mc.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

