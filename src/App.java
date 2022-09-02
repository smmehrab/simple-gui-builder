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

This is the entry point for the application.

*/

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.*;

import config.ConfigManager;
import gui.WindowManager;
import menu.GUIStyle;
import menu.Menu;

public class App extends JFrame {

    public static void main(String[] args) throws Exception {
        
        ConfigManager configManager;
        String[] configInfo;
        GUIStyle guiStyle;

        // Menu menu = new Menu();
        // configInfo = menu.selectConfigFile();
        // guiStyle = menu.selectGUIStyle();

        WindowManager windowManager = WindowManager.getInstance(); 
        windowManager.launchWindow();
        // windowManager.initializeDesignStyle(choice); // select design style
        // windowManager.initializeFram(); // initialize the frame ( java swing frame )
        // windowManager.loadUI(config); // load from file, the objects , create objects
        // windowManager.startUI(); // show the objects added from the file
    }
}
