package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputFilter.Config;
import java.util.Scanner;

import config.component.Component;
import config.component.ComponentType;
import config.xml.XMLAdapter;

public class ConfigManager {
    protected ConfigReader configReader;

    public ConfigManager(String[] configInfo) {
        String configType = configInfo[0];
        String configFilePath = configInfo[1];

        if(configType.equals("txt")) {
            configReader = new ConfigReader(configFilePath);
        }
        else if(configType.equals("xml")) {
            configReader = new XMLAdapter(configFilePath);
        }
    }

    public boolean hasNextItem() {
        return configReader.hasNextItem();
    }

    public Component nextItem() {
        return configReader.nextItem();
    }

    public void closeFile() {
        configReader.closeFile();
    }
}
