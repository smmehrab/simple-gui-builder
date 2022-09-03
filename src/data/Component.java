package data;

import enums.ComponentType;
import java.awt.*;

public class Component {

    protected int x;
    protected int y;
    protected String text;
    protected ComponentType type;
    protected Color color;
    protected Color textColor;
    protected int textSize;

    public Component(int x, int y, ComponentType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.text = "";
        this.color = hexToRGBColor("#ffffff");
        this.textColor = hexToRGBColor("#000000");
        this.textSize = 9;
    }

    public Component(Component component) {
        this.x = component.getX();
        this.y = component.getY();
        this.type = component.getType();
        this.text = component.getText();
        this.color = component.getColor();
        this.textColor = component.getTextColor();
        this.textSize = component.getTextSize();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public static Color hexToRGBColor(String colorStr) {
        return new Color(
                Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
                Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
                Integer.valueOf( colorStr.substring( 5, 7 ), 16 ));
    }
}
