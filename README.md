# SciFi UI Project

Name: Monika Adamczewska

Student Number: C17313136

# Description of the assignment

This assignment is an implementation of a SciFi User Interface.
For my assignment I decided to implement my own version of the interface used in a TV Series called "Shadowhunters"
This series is based off a series of books called "The Mortal Instruments" by Cassandra Clare.
This UI is initially supposed to provide the user with information. You will be able to find different individuals 
as well as demons on a map. As well as that, there will be a section which will provide a picture and description of
the runes used by Shadowhunters on a daily basis.   

# Instructions

It is quite simple to operate this UI. Only a mouse is needed.
When the UI is first opened, the user will be able to see a big screen on the right hand side.
There are four buttons to the left of the main screen.
They are labelled 
- "Demons"
- "Downworlders"
- "Runes"
- "Shadowhunters" 

When the user clicks on the "Demons" button, a map of New York City will be displayed within the main screen area.
Multiple red dots will appear scattered around the map. Each dot is linked to an instance of the Demon class.
When the user hovers over a red doth, a picture will appear in a black rectangle at the bottom of the screen.
This will be accessed through the demons arraylist which is initialised in the UI class.
To the right of the image, the user will be able to see the name of the Demon as well as its type.
There are two types of demons
- "Lesser Demon"
- "Greater Demon"
These details will also be accessed through the demons arraylist.


When the user clicks on the "Downworlders" button, a map will be displayed within the main screen area.
A few red dots will appear on the map in different locations. Each red dot is linked to an instance of the Downworlder class.
When the user hovers over a red dot, a picture showing the given Downworlder will appear on the bottom of the screen.
This will be accessed through the downworlders arraylist which, like the demons arraylist, is also initialised in the UI class.
Beside the image the user will see the name of the given Downworlder, as well as their class.
These will be accessed through the downworlders arraylist.
The classes are as follows
- "Werewolf"
- "Faerie"
- "Vampire"
- "Warlock"


When the user clicks on the "Shadowhunters" button, a map will be displayed within the main screen area.
There will be a few red dots on the map. Each red dot is linked to an instance of the Shadowhnter class.
When the user hovers over a red dot, a picture showing the given Shadowhunter will appear.
This will be accessed through the shadowhunters arraylist which is initialised in the UI class.
As well as the image, the name and class of the given Shadowhnter will appear next to the image.
These details will also be accessed through the shadowhunters arraylist in the UI class.



# How it works



# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

