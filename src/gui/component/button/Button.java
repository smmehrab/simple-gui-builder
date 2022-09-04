package gui.component.button;

import javax.swing.JButton;

import data.Component;
import gui.component.GUIComponent;

public abstract class Button extends GUIComponent {

    protected JButton button = new JButton();

    public Button(Component component) {
        super(component);
    }
    
    public abstract void click();
}
