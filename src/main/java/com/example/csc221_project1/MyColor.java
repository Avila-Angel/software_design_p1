package com.example.csc221_project1;

import javafx.scene.paint.Color;

public enum MyColor {
    // colors in rgba
        WHITE(255, 255, 255,255),
        DODGERBLUE(30, 144, 255, 255),
        SLATEBLUE(106,90,205,255),
        ALICEBLUE(240,248,255,255),
        LIGHTSKYBLUE(135, 206, 250, 255);

        /*
        List of other colors to experiment with
        CRIMSON(220,20,60,255),
        GOLD(255,215,0,255),
        PALEGOLDENROD(238,232,170,255),
        FORESTGREEN(34,139,34,255),
        TEAL(0,128,128,255),
        POWDERBLUE(176,224,230,255),
        INDIGO(75,0,130,255),
        HOTPINK(255,105,180,255),
        HONEYDEW(240,255,240,255);
        BLACK(240,255,240,255),
        WHEAT(245,222,179,255);
         */


        private final int r;
        private final int g;
        private final int b;
        private final int a;
        private final int rgba;

    // Default Constructor
    MyColor(int r, int g, int b, int a){
        this.r = r; // red
        this.g = g; // green
        this.b = b; // blue
        this.a = a; // opacity
        this.rgba = (a << 24) & 0xFF000000 | (r << 16) & 0x00FF0000 | (g << 8) & 0x0000FF00| (b) & 0x000000FF;
    }

    MyColor(MyColor color){
        this.r = color.getR();
        this.g = color.getG();
        this.b = color.getB();
        this.a = color.getA();
        this.rgba = color.getRGBA();
    }

    // getters
    public int getR(){
        return r; // returns r value
    }
    public int getG(){
        return g; // returns g value
    }
    public int getB(){
        return b; // returns b value
    }
    public int getA(){
        return a; // returns opacity value
    }
    public int getRGBA(){
        return rgba; // returns rgba value
    }
    public Color getColor(){
        return Color.rgb(r,g,b,a/255.0); // gets color through javafx
    }
    public String getRGBAStr(){
        return "#" + Integer.toHexString(rgba).toUpperCase(); // returns hex value
    }
}


