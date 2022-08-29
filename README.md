# Simple GUI Builder

Simple GUI Builder is a dummy project implemented using [Java Swing Framework](https://en.wikipedia.org/wiki/Swing_(Java)). The project is part of a lab assignment belonging to [CSE-3216 (Software Design Patterns Lab)](https://www.cse.du.ac.bd/curriculum/).

The purpose of this project is to get a firm understanding over the following design patterns via implementing them:

- [Adapter Design Pattern](https://youtu.be/2PKQtcJjYvc)
- [Singleton Design Pattern](https://youtu.be/hUE_j6q0LTQ)
- [Abstract Design Pattern](https://youtu.be/v-GiuMmsXj4)

<br>

## Problem

The problem is to design a modern User Interface (UI) that supports multiple design styles (motif or ”look and feel”). The core of the UI is the single **Window Manager (WM)**, which is responsible for the management of the UI items, such as **buttons, text boxes and edit boxes**. Different design styles are supported by the system: simplistic design style(for example, we can change the color of the elements), high detailed design style(for example, we can change the color and text size of the elements). WM should be initialized only by specifying the design style. Each UI item looks differently when the design style of the system is different. Also, each item has a value, which is displayed on the item itself (i.e. value of a button is the text displayed on the button).

The structure of a UI is described in a special config file. This file contains the structure of a UI

as a list of UI items, their values and their coordinates. Example of a config file:

**Button, Click on me, X: 250, Y: 300**

**EditBox, Some text to edit, X: 250, Y: 350**

**…**

A **Config Manager** class is responsible for loading config files. It has methods _nextItem()_ - returns the next item in the list and _hasMoreItems()_ - returns true if iterating through the list is not over yet. Window Manager has a method _loadUI(ConfigManager config)_, which goes through the config step by step and displays all UI items.

To extend the functionality of the system, it must also be possible to load the configuration from an XML file. Your application should adapt one of the native java XML parsing methods (DOM

Parser/Builder, SAX Parser, Java XML I/O) and make it compatible with the ConfigManager interface. Example of an XML file:

**&lt;Button value=“Click on me” X=“250” Y=“300” />**

**&lt;EditBox value=“Some text to edit” X=”250” Y=“350” />**

**...**

Finally, to test the system, load UI elements from a config file, then from an XML file and then

create several items during the runtime programmatically.

<br>

## Solution

The class diagram that's designed to solve the above problem, is given below:

![Class Diagram](https://github.com/[username]/[reponame]/blob/[branch]/image.jpg?raw=true)
