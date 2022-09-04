package gui.component.button;


import data.Component;
import gui.WindowManager;
import java.awt.Font;

import javax.swing.SwingConstants;

public class SimpleButton extends Button {
    
    public SimpleButton(Component component) {
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
        // TODO
        
    }
}
