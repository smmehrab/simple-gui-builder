package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import config.component.Component;
import config.component.ComponentType;

public class ConfigManager {
    protected File configFile;
    protected String configFilePath;
    protected String configType;
    protected Scanner scanner;

    public ConfigManager(String[] configInfo) {
        configType = configInfo[0];
        configFilePath = configInfo[1];
        configFile = new File(configFilePath);
        try {
            scanner = new Scanner(configFile);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean hasNextItem() {
        return scanner.hasNextLine();
    }

    public Component nextItem() {
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
                case "color":
                    color = value;
                case "text":
                    text = value;
                case "x":
                    x = Integer.parseInt(value);
                case "y":
                    y = Integer.parseInt(value);
                default:
                    break;
            }
        }

        Component component = new Component(type, text, color, x, y);
        return component;
    }

    public void closeFile() {
        scanner.close();
    }
}
