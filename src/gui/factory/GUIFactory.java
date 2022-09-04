package gui.factory;

import java.util.ArrayList;

import data.Component;
import gui.component.GUIComponent;

public abstract class GUIFactory {
        public ArrayList<GUIComponent> components = new ArrayList<>();
        public int componentIndex = 0;
    
        public abstract void produce(Component component);
        public abstract void modify();
}
