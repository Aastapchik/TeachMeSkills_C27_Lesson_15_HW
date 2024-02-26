package com.teachmeskills.lesson15.task2.figure;

import java.util.Objects;

/**
**The class describes a circle and contains methods for finding the area of the circle and circumference**
 */
public final class Circle extends Figure{
    double PI = 3.1415926;
    double R;
    public Circle(double R) {
        this.R = R;
        this.name = "Circle";
}
    @Override
    public double square(double[] l) {
        return PI*l[0]*l[0];
    }

    @Override
    public String perimeter() {
        return ("Длина окружности равна: " + 2*PI*R);
    }

    @Override
    public void showParameters() {
        System.out.println("Радиус круга равен: " + R);
    }



}
