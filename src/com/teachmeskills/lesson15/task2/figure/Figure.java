package com.teachmeskills.lesson15.task2.figure;

/**
**The class is a general class for shapes**
 */

public abstract sealed class Figure permits Circle, Triangle, Rectangle{
    public String name;
    //double[] length;
    abstract public double square(double[] length);
    abstract public String perimeter();
    abstract public void showParameters();

}
