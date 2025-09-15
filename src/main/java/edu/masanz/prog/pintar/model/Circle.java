package edu.masanz.prog.pintar.model;

import javafx.scene.paint.Paint;

public class Circle {

    private double x;
    private double y;
    private double radius;
    private double strokeWidth;
    private String color;

    public Circle(double x, double y, double radius, double strokeWidth, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.strokeWidth = strokeWidth;
        this.color = color;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
    public double getStrokeWidth() {
        return strokeWidth;
    }
    public Paint getColor() {
        return Paint.valueOf(color);
    }

    public void avanzar(double ax, double ay) {
        this.x += ax;
        this.y += ay;
    }

    public String toString() {
        return  "<circle " +
                        "cx=\"" + x + "\" " +
                        "cy=\"" + y + "\" " +
                        "r=\"" + radius + "\" " +
                        "stroke=\"" + color + "\" " +
                        "stroke-width=\"" + strokeWidth + "\" " +
                        "fill=\"none\" />";
    }

    public static void main(String[] args) {
        String svgHeader = "<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"1024\" height=\"768\">";
        String svgFooter = "</svg>";
        Circle c = new Circle(0, 0, 50, 5, "RED");
        c.avanzar(200, 100);
        System.out.println(svgHeader);
        System.out.println(c);
        System.out.println(svgFooter);
    }

}
