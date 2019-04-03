package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button button1;
	Button button2;
	Button button3;
	Button button4;
    MovingCircle mc;
    PImage AngelicPower;
    

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
        button1 = new Button(this, 75, 70, 100, 50, "Demons");
		button2 = new Button(this, 75, 270, 100, 50, "Downworlders");
		button3 = new Button(this, 75, 470, 100, 50, "Runes");
		button4 = new Button(this, 75, 670, 100, 50, "Shadowhunters");
		
        AngelicPower = loadImage("Angelic_Power.PNG");
    }

    public void draw()
    {
        background(0);
        stroke(66,206,244);
        rect(200,50, width - 275, height - 150);
        stroke(63,133,255);
        rect(210,60, width - 295, height - 170);
        image(AngelicPower, width - 200, 70, 100, 80);
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

