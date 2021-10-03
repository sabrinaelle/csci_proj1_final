import java.awt.*;

public class Triangle {
    private double xPosBotLeftCorner;
    private double yPosBotLeftCorner;
    private double width;
    private double height;
    private Color color;

    public Triangle(double xPosBotLeftCorner, double yPosBotLeftCorner, double width, double height) {
        this.xPosBotLeftCorner = xPosBotLeftCorner;
        this.yPosBotLeftCorner = yPosBotLeftCorner;
        this.width = width;
        this.height = height;

    }
    public double calculatePerimeter(){
        double base = this.xPosBotLeftCorner + this.width;
        double x = (this.width/2);
        double side = Math.sqrt((Math.pow(x,2)) + (Math.pow(this.height,2)));
        return base + side + side;
    }
    public double calculateArea(){
        double base = this.xPosBotLeftCorner + this.width;
        return (base/2) * this.height;
    }
    public void setColor(Color chosenColor){
        color = chosenColor;
    }
    public void setPos(double x, double y){
        this.xPosBotLeftCorner = x;
        this.yPosBotLeftCorner = y;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Color getColor() {
        return color;
    }
    public double getXPos() {
        return xPosBotLeftCorner;
    }
    public double getYPos() {
        return yPosBotLeftCorner;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

}