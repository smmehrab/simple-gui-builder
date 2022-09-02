package config.component;

public enum ComponentType {
    None,
    Button,
    Editbox,
    Textbox;

    public static ComponentType getComponentType(String type) {
        type.toLowerCase();
        switch(type) {
            case "button":
                return Button;
            case "editbox":
                return Editbox;
            case "textbox":
                return Textbox;
            default:
                break;
        }
        return None;
    }
}
