package gui.component.textbox;

import data.Component;
import gui.WindowManager;
import java.awt.Font;

import javax.swing.SwingConstants;

public class SimpleTextBox extends TextBox {
    
    public SimpleTextBox(Component component) {
        super(component);
    }

    @Override
    public void render() {
        super.textbox.setBounds(super.x,super.y, 100, 50);
        super.textbox.setText(super.text);
        super.textbox.setBackground(super.color);
        super.textbox.setForeground(super.textColor);
        super.textbox.setFont(new Font("Serif", Font.PLAIN, super.textSize));
        super.textbox.setHorizontalAlignment(SwingConstants.CENTER);
        super.textbox.setEditable(false);
        WindowManager.getInstance().getCanvas().add(super.textbox);
    }

    @Override
    public void modify(String type, String value) {
        switch(type) {
            case "color":
                super.textbox.setBackground(Component.hexToRGBColor(value));
                break;
            case "text-color":
                super.textbox.setForeground(Component.hexToRGBColor(value));
                break;
            default:
                break;
        }        
    }

    @Override
    public void modify(String type, int value) {
        // TODO Auto-generated method stub
        
    }
}
