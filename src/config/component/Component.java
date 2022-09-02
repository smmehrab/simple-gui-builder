package config.component;

public class Component {
    private ComponentType type;
    private String text;
    private String color; 
    private int x;
    private int y;
    
    public Component(ComponentType type, String text, String color, int x, int y) {
        this.type = type;
        this.text = text;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
