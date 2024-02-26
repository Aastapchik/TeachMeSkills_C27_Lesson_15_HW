package com.teachmeskills.lesson15.task2.figure;

/**
 **The class describes a rectangle and contains methods for finding the area and perimeter of a rectangle**
 */
public final class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }

    @Override
    public double square(double[] l) {
        return l[0] * l[1];
    }

    @Override
    public String perimeter() {
        return ("Периметр прямугольника равен: " + 2 * (a + b));
    }

    @Override
    public void showParameters() {
        System.out.println("Длина прямоугольника равна: " + a + ", его ширина равна: " + b + ".");
    }


}
