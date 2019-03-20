package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button button1;
	Button button2;
	Button button3;
	Button button4;
    MovingCircle mc;

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
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        button1 = new Button(this, 50, 50, 100, 50, "Demons");
		button2 = new Button(this, 50, 250, 100, 50, "Downworlders");
		button3 = new Button(this, 650, 50, 100, 50, "Runes");
		button4 = new Button(this, 650, 250, 100, 50, "Shadowhunters");
		
        mc = new MovingCircle(this, width / 2, height / 2, 50);
    }

    public void draw()
    {
        background(0);
        button1.render();
		button2.render();
		button3.render();
		button4.render();

        mc.update();
        mc.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

