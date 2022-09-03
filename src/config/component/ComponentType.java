package config.component;

public enum ComponentType {
    Button("button"),
    Editbox("editbox"),
    Textbox("textbox"),
    None("");

    private String text;
    ComponentType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static ComponentType fromString(String text) {
        for (ComponentType componentType : ComponentType.values()) {
            if (componentType.text.equalsIgnoreCase(text)) {
                return componentType;
            }
        }
        return null;
    }
}
