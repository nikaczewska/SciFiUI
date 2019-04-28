package ie.tudublin;

import processing.core.PImage;

public class Demon
{
    UI ui;
    PImage demon;
    String name;
    String type;

    public Demon(UI ui, PImage demon, String name, String type)
    {
        this.ui = ui;
        this.demon = demon;
        this.name = name;
        this.type = type;
    }
}