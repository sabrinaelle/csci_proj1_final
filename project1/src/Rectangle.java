import java.awt.*;

public class Rectangle {

    private double xPosUpperLeft;
    private double yPosUpperLeft;
    private double height;
    private double width;
    private Color color;

    public Rectangle(double xPosUpperLeft, double yPosUpperLeft, double height, double width){
        this.xPosUpperLeft= xPosUpperLeft;
        this.yPosUpperLeft = yPosUpperLeft;
        this.height = height;
        this.width = width;
    }
    public double calculatePerimeter(){
        return this.height +this.height +this.width + this.width;
    }
    public double calculateArea(){
        return this.width*this.height;
    }
    public void setColor(Color chosenColor){
        color = chosenColor;
    }
    public Color getColor(){
        return color;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setPos(double x, double y){
        this.xPosUpperLeft = x;
        this.yPosUpperLeft = y;
    }
    public double getXPos() {
        return xPosUpperLeft;
    }
    public double getYPos() {
        return yPosUpperLeft;
    }

}