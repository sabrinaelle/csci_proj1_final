import java.awt.*;
public class Circle {

    private double xPos;
    private double yPos;
    private double radius;
    private Color color;

    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*this.radius;
    }

    public double calculateArea(){
        return Math.PI*(Math.pow(this.radius,2));
    }

    public void setColor(Color col){
        color = col;
    }
    public Color getColor(){
        return color;
    }
    public void setPos(double x, double y){
        this.xPos = x;
        this.yPos = y;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getXPos() {
        return xPos;
    }
    public double getYPos() {
        return yPos;
    }












}