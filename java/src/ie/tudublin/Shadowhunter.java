package ie.tudublin;

import processing.core.PImage;

public class Shadowhunter
{
    UI ui;
    PImage shadowhunter;
    String name;
    String type;

    public Shadowhunter(UI ui, PImage shadowhunter, String name, String type)
    {
        this.ui = ui;
        this.shadowhunter = shadowhunter;
        this.name = name;
        this.type = type;

    }
}