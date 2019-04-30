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
The location of the given demon will also be displayed on the screen.


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
The location of each downworlder will be displayed along with their name and class.


When the user clicks on the "Shadowhunters" button, a map will be displayed within the main screen area.
There will be a few red dots on the map. Each red dot is linked to an instance of the Shadowhnter class.
When the user hovers over a red dot, a picture showing the given Shadowhunter will appear.
This will be accessed through the shadowhunters arraylist which is initialised in the UI class.
As well as the image, the name and class of the given Shadowhnter will appear next to the image.
These details will also be accessed through the shadowhunters arraylist in the UI class.
The location of each given shadowhunter will also be displayed along with their picture and details.




# How it works

In order to make this project work, I had to create multiple different classes. Each class had its own purpose.
The classes were as follows:
- Button /
- Demon /
- Downworlder /
- Main / 
- NYCMap /
- RedDot /
- Rune  /
- Shadowhnter /
- UI

The purpose of the Main class is to run the program.

The Demon, Downworlder and Shadowhnter classes are initially identical. 
They all store the name, type, location and an image of a given character.
I didn't use a single class for all of the characters as it was confusing to me and I kept getting mixed up.

The Rune class stores an image of a certain rune. These are displayed on the screen.

The NYCMap class takes in 6 parameters. Its purpose is to draw a map of New York City on the main screen.

The RedDot class is used to display red dots on the map when the user clicks on one of the buttons labelled "Downworlders", "Shadowhunters" or "Demons".
Each instance of the RedDot class stores the type of character and the position of the given character in its arraylist. 
The types are as follows :
- 1 -> Shadowhnter
- 2 -> Demon
- 3 -> Downworlder
For example, if the type variable is 1 and the pos variable is set to 2, 
this means that the character displayed on the screen will be the 3rd element of the shadowhunters arraylist.

The Button class is used to draw three buttons on the screen. It contains a MouseClicked method. Depending on which button is clicked, the click variable is changed.
An arraylist called redDots of type RedDot is created at the beginning.
There are three different options associated with the MouseClicked method.
If the "Shadowhnters" button is clicked the click variable is set to 1.
The redDots arraylist is emptied of any contents.
This then causes a new instance of the NYCMap class to be created. 
As well as that, 6 new instances of the RedDot class are created. These will show up on the map and are linked to the shadowhunter arraylist.
The red dots are added to an arraylist of type RedDot. The render and MouseClicked methods are called within each instance of the RedDot class.

If the "Demons" button is clicked the click variable is set to 2.
The redDots arraylist is emptied of any contents.
A new instance of the NYCMap class is created and 6 new instances of the RedDot class are created. These will show up on the map.
They are linked to the demons arraylist.
The red dots are then added to an arraylist of type RedDot. The render and MouseClicked methods are called within each instance of the RedDot class.

If the "Downworlders" button is clicked the click variable is set to 3.
The redDots arraylist is emptied of any contents.
A new instance of the NYCMap class is created. As well as that, 6 new instances of the RedDot class are created. These will show up on the map.
The red dots are linked to the downworlders arraylist.
The newly initialised red dots are then added to the redDots arraylist. The render and MouseClicked methods are called within each instance of the RedDot class.

The UI class contains four arraylists:
- runes of class Rune
- shadowhunters of class Shadowhnter
- demons of class Demon
- downworlders of class Downworlder

The runes arraylist stores 9 different images of runes which are displayed at the bottom of the screen.
The shadowhunters arraylist stores 6 different shadowhunter characters. It stores an image, name, type and location of each character.
The demons arraylist stores 6 different demon characters. It stores an image, name, type and location of each character.
The downworlders arraylist stores 6 different downworlder characters. It stores an image, name, type and location of each character.

All of the images needed in this assignment are loaded in the setup method of the UI class.
The three buttons are also initialised in the setup.

In the draw method, the two rectangles that make up the main screen are drawn.
The arraylist of runes is used to draw 9 different images below the main screen.
The MouseClicked, render and update methods are called for each individual button.


# What I am most proud of in the assignment

I am most proud of the fact that I was able to somewhat re-create a user interface that was used in 
a book/tv series that I am interested in. I was able to figure out the positioning of different shapes and images.
Learning how to use images in processing and java proved to be very useful for me too, as most of the features
implemented in my assignment are based on images.
What took me the most time was figuring out how to get the MouseClicked methods to work so that once the map
appeared on the screen it wouldn't disappear when I moved the mouse away from the certain button.
It took a lot of figuring out and trial and error but eventually I was able to make the method work as desired. 
Overcoming that problem brought me great joy and sped up the process of finishing the assignment.
As well as that, learning how to access the different parts of each arraylist helped me get a better understanding
of the Java programming language.

#YouTube video of the assignment

[![YouTube] (https://img.www.youtube.com/watch?v=PlEE7Hpr-1s&feature=youtu.be/0.jpg)](https://www.youtube.com/watch?v=PlEE7Hpr-1s&feature=youtu.be)


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

