package com.example.csc221_project1;

import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape{
    private int w, h;
    private MyPoint pInitial;
    private MyColor color;

    //Default Constructor
    MyRectangle(int width, int height, MyPoint p, MyColor color){
        this.w = width;
        this.h = height;
        this.pInitial = p;
        this.color = color;
    }
    //Copy Constructor
    MyRectangle(MyRectangle temp){
        this.w = temp.getWidth();
        this.h = temp.getHeight();
        this.pInitial = temp.getP();
        this.color = temp.getColor();
    }

    // getters
    public MyPoint getP(){
        return pInitial; // returns initial point
    }
    public int getWidth() {
        return w; // returns width
    }
    public int getHeight() {
        return h; // returns height
    }
    @Override
    public MyColor getColor() {
        return color; // returns color, overrides getColor() from MyShape superclass
    }

    // Area and Perimeter

    @Override
    public double area() {
        return w * h; // returns area
    }
    @Override
    public double perimeter(){
        return 2 * (w + h); // returns perimeter
    }

    //ToString - returns a string with MyRectangle description
    @Override
    public String toString() {
        return "p: "+ "("+ pInitial.getX() + "," + pInitial.getY() +")\n" +
                "Width: " + w +
                "\nHeight: " + h +
                "\nArea: " + area() +
                "\nPerimeter: " + perimeter() +
                 "\n";
    }

    //draw
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(this.getColor().getColor()); // sets color
        gc.fillRect(pInitial.getX(), pInitial.getY(), w, h); // draws rectangle
    }
}
