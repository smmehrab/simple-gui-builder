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
*/

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.*;

import config.ConfigManager;
import menu.GUIStyle;
import menu.Menu;

public class App extends JFrame {

    public static void main(String[] args) throws Exception {
        
        ConfigManager configManager;
        String[] configInfo;
        GUIStyle guiStyle;

        Menu menu = new Menu();
        configInfo = menu.selectConfigFile();
        guiStyle = menu.selectGUIStyle();

        
    }
}
