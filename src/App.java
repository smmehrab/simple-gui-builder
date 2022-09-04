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
import data.Component;
import enums.GUIStyle;
import gui.WindowManager;
// import gui.WindowManager;
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

        // Debug
        // while(config.hasNextItem()) {
        //     Component component = config.nextItem();
        //     System.out.println("x           : " + component.getX());
        //     System.out.println("y           : " + component.getY());
        //     System.out.println("type        : " + component.getType());
        //     System.out.println("text        : " + component.getText());
        //     System.out.println("color       : " + component.getColor().toString());
        //     System.out.println("textColor   : " + component.getTextColor().toString());
        //     System.out.println("textSize    : " + component.getTextSize());
        // }
        // config.closeFile();

        WindowManager windowManager = WindowManager.getInstance();
        windowManager.selectGUIStyle(guiStyle);
        windowManager.loadUI(config);
        // windowManager.designStyle(guiStyle);
        windowManager.launchWindow();
    }
}
