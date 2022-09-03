/*
-----------------------------------------------------
# fullname      :   s.m.mehrabul islam
# roll          :   sh-86
# registration  :   2017614964
# session       :   2017-2018
# email         :   smmehrabul-2017614964@cs.du.ac.bd
# department    :   computer science & engineering
# institute     :   university of dhaka, bangladesh
-----------------------------------------------------

** Adapter Design Pattern **

ClientInterface for XMLAdapter
(Or for other adapters, in future)

*/

package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import enums.ComponentType;

public class ConfigReader {
    protected File file;
    protected Scanner scanner;

    public ConfigReader(String path) {
        file = new File(path);
        try {
            scanner = new Scanner(file);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean hasNextItem() {
        return scanner.hasNextLine();
    }

    public ConfigComponent nextItem() {
        String componentString = scanner.nextLine();
        String[] componentAttributes = componentString.split(",");
        String name, value;

        ComponentType type = ComponentType.None;
        String text = "";
        String color = "";
        int x = -1;
        int y = -1;

        for(String componentAttribute : componentAttributes) {
            String[] parts = componentAttribute.split(":");
            name = parts[0].toLowerCase();
            value = parts[1];

            switch(name) {
                case "type":
                    type = ComponentType.fromString(value);
                    break;
                case "color":
                    color = value;
                    break;
                case "text":
                    text = value;
                    break;
                case "x":
                    x = Integer.parseInt(value);
                    break;
                case "y":
                    y = Integer.parseInt(value);
                    break;
                default:
                    break;
            }
        }

        ConfigComponent component = new ConfigComponent(type, text, color, x, y);
        return component;
    }

    public void closeFile() {
        scanner.close();
    }
}
