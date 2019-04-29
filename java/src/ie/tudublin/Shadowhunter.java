package ie.tudublin;

import processing.core.PImage;

public class Shadowhunter
{
    UI ui;
    PImage shadowhunter;
    String name;
    String type;
    String location;

    public Shadowhunter(UI ui, PImage shadowhunter, String name, String type, String location)
    {
        this.ui = ui;
        this.shadowhunter = shadowhunter;
        this.name = name;
        this.type = type;
        this.location = location;

    }
}