package gui.component;

import data.Component;

public abstract class GUIComponent extends Component {
    
    public GUIComponent(Component component) {
        super(component);
    }

    public abstract void render();
    public abstract void modify(String type, String value);
    public abstract void modify(String type, int value);
}
