package gui.component.editbox;

import data.Component;
import gui.WindowManager;
import java.awt.Font;

import javax.swing.SwingConstants;

public class SimpleEditBox extends EditBox {

    public SimpleEditBox(Component component) {
        super(component);
    }

    @Override
    public void render() {
        super.editBox.setBounds(super.x,super.y, 100, 50);
        super.editBox.setText(super.text);
        super.editBox.setBackground(super.color);
        super.editBox.setForeground(super.textColor);
        super.editBox.setFont(new Font("Serif", Font.PLAIN, super.textSize));
        super.editBox.setHorizontalAlignment(SwingConstants.CENTER);
        super.editBox.setEditable(true);
        WindowManager.getInstance().getCanvas().add(super.editBox);
    }

    @Override
    public void modify(String type, String value) {
        switch(type) {
            case "color":
                super.editBox.setBackground(Component.hexToRGBColor(value));
                break;
            case "text-color":
                super.editBox.setForeground(Component.hexToRGBColor(value));
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
