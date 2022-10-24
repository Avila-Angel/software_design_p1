package com.example.csc221_project1;

import javafx.scene.canvas.GraphicsContext;

class MyShape {
    MyPoint point;
    MyColor color;


    // Constructor
    MyShape() { // default constructor - sets initial values for point and color
        this.point = new MyPoint(0,0);
        this.color = MyColor.DODGERBLUE; // default color
    }
    MyShape(MyPoint p, MyColor color) {
        this.point = p;
        this.color = color;
    }
    MyShape(int x, int y) {
        this.point = new MyPoint(x, y);
        this.color = MyColor.DODGERBLUE;
    }
    MyShape(int x, int y, MyColor color) {
        this.point = new MyPoint(x, y);
        this.color = color; // default color
    }

    // Getters

    public int getX() {
        return point.getX(); // returns x-coordinate starting point
    }
    public int getY() {
        return point.getY(); // returns y-coordinate starting point
    }

    public MyColor getColor() {
        return color; // returns MyColor object
    }

    // Area and perimeter set to 0
    public double area() { // returns area of shape
        return 0;
    }
    public double perimeter() { // returns perimeter
        return 0;
    }

    // toString - returns description of object

    @Override
    public String toString() {
        return "Point: {" + getX() + "," + getY() + '}' +
                "Color: " + getColor().getRGBAStr();
    }

    // graphics context object, draws and fills rectangle color
    public void draw(GraphicsContext gc) {
        gc.setFill(this.getColor().getColor());
        gc.fillRect(getX(), getX(), 50, 50);
    }
}
