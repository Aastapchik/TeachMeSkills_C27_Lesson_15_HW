package com.teachmeskills.lesson15.task2.figure;
/**
**The class describes a triangle and contains methods for finding the area and perimeter of a triangle**
 */
public final class  Triangle extends Figure{
    double a;
    double b;
    double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "Triangle";
    }
    @Override
   public  double square(double[] l) {
        double p = 0.5*(l[0] + l[1] + l[2]);
        return Math.sqrt(p*(p-l[0])*(p-l[1])*(p-l[2]));
    }

    @Override
    public String perimeter() {
        return ("Периметр треугольника равен: " + (a + b + c));
    }

    @Override
    public void showParameters() {
        System.out.println("Первая сторона треугольника равна: " + a + ", вторая сторона треугольника равна: " + b + ", третья сторона треугольника равна " + c + ".");
    }


}
