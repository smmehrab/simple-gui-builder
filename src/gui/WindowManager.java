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

import java.awt.GraphicsDevice;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.FlowView;

import config.ConfigManager;

public class WindowManager{

    private static WindowManager instance;

    private WindowManager() {}
    
    public static WindowManager getInstance() {
        if(instance==null)
            instance = new WindowManager();
        return instance;
    }

    public void loadUI(ConfigManager configManager) {

    }
    
    public void launchWindow() {
        JFrame window = new JFrame("Simple GUI Builder");
        window.setLocation(100, 100);
        window.setSize(new Dimension(1024, 800));
        window.setBackground(new Color(0x000000));
        

        // JLabel editTextLabel = new JLabel("Edit Text");
        // editTextLabel.setBackground(new Color(0x000000));
        // editTextLabel.setSize(new Dimension(300, 100));
        // editTextLabel.setBounds(50, 20, 100, 100);
        
        // JPanel sidebar = new JPanel();
        // sidebar.setSize(new Dimension(300, 800));
        // sidebar.setBackground(new Color(0x2d333b));

        // sidebar.add(editTextLabel);
        // sidebar.repaint();

        
        // window.add(sidebar);

        // JPanel canvas = new JPanel();
        // canvas.setSize(new Dimension(724, 800));
        // canvas.setBackground(new Color(0xffffff));
        // window.add(canvas);

        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true); 
    }

}
