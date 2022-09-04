package gui.factory;

import data.Component;
import enums.ComponentType;
import gui.component.button.AdvancedButton;
import gui.component.editbox.AdvancedEditBox;
import gui.component.textbox.AdvancedTextBox;

public class AdvancedGUIFactory extends GUIFactory{

    @Override
    public void produce(Component component) {
        if(component.getType() == ComponentType.Button) {
            super.components.add(new AdvancedButton(component));
        }
        else if(component.getType() == ComponentType.Editbox) {
            super.components.add(new AdvancedEditBox(component));
        }
        else if(component.getType() == ComponentType.Textbox) {
            super.components.add(new AdvancedTextBox(component));
        }
    }

    @Override
    public void modify() {
        // TODO Auto-generated method stub
        
    }
    
}
