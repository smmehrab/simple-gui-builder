package gui.component.button;

import javax.swing.SwingConstants;

import data.Component;
import gui.WindowManager;
import java.awt.Font;

public class AdvancedButton extends Button {

    public AdvancedButton(Component component) {
        super(component);
    }

    @Override
    public void render() {
        super.button.setBounds(super.x,super.y, 100, 50);
        super.button.setText(super.text);
        super.button.setBackground(super.color);
        super.button.setForeground(super.textColor);
        super.button.setFont(new Font("Serif", Font.PLAIN, super.textSize));
        super.button.setHorizontalAlignment(SwingConstants.CENTER);
        WindowManager.getInstance().getCanvas().add(super.button);
    }

    @Override
    public void click() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modify(String type, String value) {
        switch(type) {
            case "color":
                super.button.setBackground(Component.hexToRGBColor(value));
                break;
            case "text-color":
                super.button.setForeground(Component.hexToRGBColor(value));
                break;
            default:
                break;
        }
    }

    @Override
    public void modify(String type, int value) {
        switch(type) {
            case "text-size":
                super.button.setFont(new Font("Serif", Font.PLAIN, textSize));
                break;
            default:
                break;
        }
    }
}
