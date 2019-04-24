package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    ArrayList<RedDot> redDots = new ArrayList<RedDot>();
    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Rune> runes = new ArrayList<Rune>();
    ArrayList<Demon> demons = new ArrayList<Demon>();
    ArrayList<Shadowhunter> shadowhunters = new ArrayList<Shadowhunter>();
    ArrayList<Downworlder> downworlders = new ArrayList<Downworlder>();

    //Declaring variables to be used for class objects
    Button button1;
	Button button2;
	Button button3;
    Button button4;
    NYCMap NycMap;

    //Declaring variables for images and adding them to the correct array lists
    PImage AngelicPower;
    Rune rune1;
    Rune rune2;
    Rune rune3;
    Rune rune4;
    Rune rune5;
    Rune rune6;
    Rune rune7;
    Rune rune8;
    Rune rune9;
    PImage nyc;
    PImage black;
    Demon demonAbbadon;
    Demon demonBehemoth;
    Demon demonHunger;
    Demon demonRaum;
    Demon demonRavener;
    Demon demonVermithrall;
    Shadowhunter Alec_Lightwood;
    Shadowhunter Clary_Fray;
    Shadowhunter Isabelle_Lightwood;
    Shadowhunter Jace_Wayland;
    Shadowhunter Sebastian_Verlac;
    Shadowhunter Valentine_Morgenstern;
    Downworlder Magnus_Bane;
    Downworlder Maia;
    Downworlder Luke_Garroway;
    Downworlder Seelie_Queen;
    Downworlder Simon_Lewis;
    Downworlder Raphael_Santiago;

    //Declaring variables for image height and width
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
        //Loading all rune images from data folder and adding to rune arraylist
        AngelicPower = loadImage("Angelic_Power.PNG");
        rune1 = new Rune(this,loadImage("Abundance.PNG"));
        rune2 = new Rune(this,loadImage("Acceleration.PNG"));
        rune3 = new Rune(this,loadImage("Accuracy.PNG"));
        rune4 = new Rune(this,loadImage("Action.PNG"));
        rune5 = new Rune(this,loadImage("Agility.PNG"));
        rune6 = new Rune(this,loadImage("Agony.PNG"));
        rune7 = new Rune(this,loadImage("Allied_To.PNG"));
        rune8 = new Rune(this,loadImage("Courage_In_Combat.PNG"));
        rune9 = new Rune(this,loadImage("Clarity.PNG"));

        runes.add(rune1);
        runes.add(rune2);
        runes.add(rune3);
        runes.add(rune4);
        runes.add(rune5);
        runes.add(rune6);
        runes.add(rune7);
        runes.add(rune8);
        runes.add(rune9);

        //Loading image of map from data folder
        nyc = loadImage("NewYork.jpg");
        black = loadImage("black.png");
        //Loading all demon images from data folder and adding the demon objects to demon arraylist
        demonAbbadon = new Demon(this,loadImage("Demon_Abbadon.png"));
        demonBehemoth = new Demon(this, loadImage("Demon_Behemoth.png"));
        demonHunger = new Demon(this,loadImage("Demon_Hunger.png"));
        demonRaum = new Demon(this,loadImage("Demon_Raum.png"));
        demonRavener = new Demon(this,loadImage("Demon_Ravener.jpg"));
        demonVermithrall = new Demon(this,loadImage("Demon_Vermithrall.png"));

        demons.add(demonAbbadon);
        demons.add(demonBehemoth);
        demons.add(demonHunger);
        demons.add(demonRaum);
        demons.add(demonRavener);
        demons.add(demonVermithrall);

        //Loading all shadowhunter images from data folder and adding to shadowhunter arraylist
        Alec_Lightwood = new Shadowhunter(this, loadImage("Alec_Lightwood.jpg"));
        Clary_Fray =  new Shadowhunter(this, loadImage("Clary_Fray.jpg"));
        Isabelle_Lightwood =  new Shadowhunter(this, loadImage("Isabelle_Lightwood.jpg"));
        Jace_Wayland =  new Shadowhunter(this, loadImage("Jace_Wayland.jpg"));
        Sebastian_Verlac =  new Shadowhunter(this, loadImage("Sebastian_Verlac.jpg"));
        Valentine_Morgenstern =  new Shadowhunter(this, loadImage("Valentine_Morgenstern.jpg"));

        shadowhunters.add(Alec_Lightwood);
        shadowhunters.add(Clary_Fray);
        shadowhunters.add(Isabelle_Lightwood);
        shadowhunters.add(Jace_Wayland);
        shadowhunters.add(Sebastian_Verlac);
        shadowhunters.add(Valentine_Morgenstern);

        //Loading all downworlder images from data folder and adding to downworlder arraylist
        Magnus_Bane = new Downworlder(this,loadImage("Magnus_Bane.jpg"),"Magnus Bane","Warlock");
        Maia = new Downworlder(this, loadImage("Maia.png"),"Maia","Werewolf");
        Luke_Garroway = new Downworlder(this, loadImage("Luke_Garroway.jpg"),"Luke Garroway","Werewolf");
        Simon_Lewis = new Downworlder(this, loadImage("Simon_Lewis.jpg"),"Simon_Lewis","Vampire");
        Seelie_Queen = new Downworlder(this, loadImage("Seelie_Queen.png"),"Seelie Queen","Faerie");
        Raphael_Santiago = new Downworlder(this, loadImage("Raphael_Santiago.jpg"),"Raphael Santiago","Vampire");

        downworlders.add(Magnus_Bane);
        downworlders.add(Maia);
        downworlders.add(Luke_Garroway);
        downworlders.add(Simon_Lewis);
        downworlders.add(Seelie_Queen);
        downworlders.add(Raphael_Santiago);


        //NycMap = new NYCMap(this, 212, 62, width - 297, height - 172, nyc);
        button1 = new Button(this, 75, 470, 100, 50, "Runes", nyc, black);
        button2 = new Button(this, 75, 70, 100, 50, "Demons", nyc, black);
		button3 = new Button(this, 75, 270, 100, 50, "Downworlders",nyc, black);
        button4 = new Button(this, 75, 670, 100, 50, "Shadowhunters",nyc, black);
    }

    public void draw()
    {
        background(0);
        stroke(66,206,244);
        rect(200,50, width - 275, height - 150);
        stroke(63,133,255);
        rect(210,60, width - 295, height - 170);
        //NycMap.render();
        image(AngelicPower, width - 200, 70, RuneHeight, RuneHeight);
        image(rune1.rune, 200, height - 90, RuneHeight,RuneWidth);
        image(rune2.rune, 300, height - 90, RuneHeight,RuneWidth);
        image(rune3.rune, 400, height - 90, RuneHeight, RuneWidth);
        image(rune4.rune, 500, height - 90, RuneHeight, RuneWidth);
        image(rune5.rune, 600, height - 90, RuneHeight,RuneWidth);
        image(rune6.rune, 700, height - 90, RuneHeight, RuneWidth);
        image(rune7.rune, 800, height - 90, RuneHeight, RuneWidth);
        image(rune8.rune, 900, height - 90, RuneHeight, RuneWidth);
        image(rune9.rune, 1000, height - 90, RuneHeight, RuneWidth);

        button1.mouseClicked();
        button2.mouseClicked();
        button3.mouseClicked();
        button4.mouseClicked();
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

