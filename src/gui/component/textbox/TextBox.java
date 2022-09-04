package gui.component.textbox;

import javax.swing.JTextField;

import data.Component;
import gui.component.GUIComponent;

public abstract class TextBox extends GUIComponent {
    protected JTextField textbox = new JTextField();

    public TextBox(Component component) {
        super(component);
    }
}
