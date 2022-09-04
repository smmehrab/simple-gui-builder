package gui.component.editbox;

import javax.swing.JTextField;

import data.Component;
import gui.component.GUIComponent;

public abstract class EditBox extends GUIComponent {
    protected JTextField editBox = new JTextField();

    public EditBox(Component component) {
        super(component);
    }
}
