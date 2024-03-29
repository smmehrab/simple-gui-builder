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

WindowManager is a Singleton Class

*/

package gui;

import java.awt.*;
import javax.swing.*;

import config.ConfigManager;
import data.Component;
import enums.GUIStyle;
import gui.component.GUIComponent;
import gui.factory.AdvancedGUIFactory;
import gui.factory.GUIFactory;
import gui.factory.SimpleGUIFactory;

public class WindowManager{
    private static WindowManager instance;

    public static JFrame window = new JFrame("Simple GUI Builder"); 
    public static JPanel canvas = new JPanel();

    private GUIFactory guiFactory;

    private WindowManager() {}
    
    public static WindowManager getInstance() {
        if(instance==null) {
            instance = new WindowManager();
        }
        return instance;
    }

    public void selectGUIStyle(GUIStyle guiStyle) {
        if(guiStyle == GUIStyle.SIMPLE) {
            guiFactory = new SimpleGUIFactory();
        }
        else if(guiStyle == GUIStyle.ADVANCED) {
            guiFactory = new AdvancedGUIFactory();
        }
    }

    public void loadUI(ConfigManager config) {
        while(config.hasNextItem()) {
            Component component = config.nextItem();
            guiFactory.produce(component);
        }
        config.closeFile();
    }
    
    public void launchWindow() {
        window.setLocation(100, 100);
        window.setSize(new Dimension(1024, 800));
        window.setBackground(new Color(0x000000));

        window.add(canvas);
        canvas.setLayout(null); 

        for(GUIComponent component : guiFactory.components) {
            component.render();
        }

        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
        System.out.println("> [LAUNCHED WINDOW]");
        guiFactory.modify();
    }

    public void closeWindow() {
        window.dispose();
    }

    public void resetWindow() {
        this.closeWindow();
        this.launchWindow();
    }

    public JPanel getCanvas() {
        return canvas;
    }
}   
