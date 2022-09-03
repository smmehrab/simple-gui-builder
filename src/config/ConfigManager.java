package config;

import config.xml.XMLAdapter;

public class ConfigManager {
    protected ConfigReader configReader;

    public ConfigManager(String[] configInfo) {
        String configType = configInfo[0];
        String configFilePath = configInfo[1];

        switch(configType) {
            case "txt":
                configReader = new ConfigReader(configFilePath);
                break;
            case "xml":
                configReader = new XMLAdapter(configFilePath);
                break;
            default:
                configReader = new ConfigReader(configFilePath);
                break;
        }
    }

    public boolean hasNextItem() {
        return configReader.hasNextItem();
    }

    public ConfigComponent nextItem() {
        return configReader.nextItem();
    }

    public void closeFile() {
        configReader.closeFile();
    }
}
