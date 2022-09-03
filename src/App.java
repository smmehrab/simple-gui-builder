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

Entry Point (Application)

*/


import javax.swing.*;

import config.ConfigManager;
import config.component.Component;
import menu.GUIStyle;
import menu.Menu;

public class App extends JFrame {

    public static void main(String[] args) throws Exception {
        
        ConfigManager config;
        String[] configInfo;
        GUIStyle guiStyle;

        Menu menu = new Menu();
        configInfo = menu.selectConfigFile();
        guiStyle = menu.selectGUIStyle();

        config = new ConfigManager(configInfo);
        while(config.hasNextItem()) {
            Component component = config.nextItem();
            System.out.println(component.getX()+" "+component.getY()+" "+component.getType()+" "+component.getText()+" ");
        }
        config.closeFile();

        // WindowManager windowManager = WindowManager.getInstance(); 
        // windowManager.launchWindow();
        // windowManager.initializeDesignStyle(choice); // select design style
        // windowManager.initializeFram(); // initialize the frame ( java swing frame )
        // windowManager.loadUI(config); // load from file, the objects , create objects
        // windowManager.startUI(); // show the objects added from the file
    }
}
