package com.example.csc221_project1;

// import java.lang.Math;
// import java.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Project extends Application {
    static int x = 600; // window x coordinate
    static int y = 600; // window y coordinate
    @Override
    public void start(Stage stage) {
        int colorValues = MyColor.values().length;
        MyColor [] colorsList = MyColor.values();
        Group root = new Group();
        stage.setTitle("CSC 22100 Assignment 1"); // create a title for our scene at the top
        Canvas canvas = new Canvas(x,y); // creates screen canvas with x and y values
        GraphicsContext gc = canvas.getGraphicsContext2D(); // returns graphic context

        //starting position and size
        int a =0; // starting position of shape
        int b = 0; // starting position of shape
        int c = x; // x dimension of application
        int d = y; // y dimension of application

        //New positions
        a += (x * (2 - Math.sqrt(2)) / 4); // x coordinate
        b += (y * (2 - Math.sqrt(2)) / 4); // y coordinate

        //New size
        c /= Math.sqrt(2); // calculates width of rectangle
        d /= Math.sqrt(2); // calculates height of rectangle

        // sequence of alternating concentric circles and their inscribed rectangles
        for(int cnt = 0; cnt < 3; cnt++,
                a += (c*(2-Math.sqrt(2)) / 4),
                b += (d*(2-Math.sqrt(2)) / 4) ,
                c /= Math.sqrt(2),
                d /= Math.sqrt(2)) {
            MyRectangle R = new MyRectangle(d,c,new MyPoint(a,b), colorsList[cnt % colorValues]);
            MyOval O = new MyOval(d,c,new MyPoint(a + (c / 2),b + (d / 2)),colorsList[(cnt + 2) % colorValues]);
            R.draw(gc); // draws rectangle
            O.draw(gc); // draws oval
        }

        root.getChildren().add(canvas);
        stage.setScene(new Scene(root)); // adds scene to stage
        stage.show(); // shows stage (keep at end of start method)
    }
    public static void main(String[] args) {
        launch(args); // launches application
    }
}
