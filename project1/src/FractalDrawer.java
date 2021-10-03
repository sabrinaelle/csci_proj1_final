// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    private Random random = new Random();
    float red = random.nextFloat();
    float green = random.nextFloat();
    float blue = random.nextFloat();
    Color ranColor = new Color(red,green,blue);

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {

        Canvas drawing = new Canvas();
        if (type.equals("circle")){
            drawCircleFractal(100, 500,500,ranColor, drawing, 7 );
            return totalArea;
        }else if(type.equals("triangle")){
            drawTriangleFractal(200, 200, 500,500, ranColor, drawing, 7);
            return totalArea;
        }else if (type.equals("rectangle")){
            drawRectangleFractal(200,200,500,500,ranColor, drawing, 7);
            return totalArea;
        }
        return 0;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Canvas drawing = new Canvas(800,800);
        Triangle tri = new Triangle(x, y, width, height);
        if (level != 0){
            can.drawShape(tri);
            double width2 = width/2;
            double height2 = height/2;
            double xpos2 = x+ width;
            double ypos2 = y+ height;
            Color color = ranColor;
            drawing.drawShape(tri);
            drawTriangleFractal(width2,height2,xpos2,ypos2,color, can, 7);


        }

    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle cir = new Circle(x, y,radius);
        cir.setColor(c);



    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        Triangle tri = new Triangle(200,200,100,100);




//        Scanner s = new Scanner(System.in);
//        System.out.println("Which base would you like for your fractal? : circle, triangle, rectangle");
//        String input = s.next();



    }
}

//Written by Sabrina Simkhovich, simkh005