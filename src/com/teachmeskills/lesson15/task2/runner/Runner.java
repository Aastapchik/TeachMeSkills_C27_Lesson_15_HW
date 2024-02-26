package com.teachmeskills.lesson15.task2.runner;

import com.teachmeskills.lesson15.task1.constants.Const;
import com.teachmeskills.lesson15.task2.fabricFigure.FabricCircle;
import com.teachmeskills.lesson15.task2.fabricFigure.FabricRectangle;
import com.teachmeskills.lesson15.task2.fabricFigure.FabricTriangle;
import com.teachmeskills.lesson15.task2.figure.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The class simulates the work of a program to fill a collection with objects of the abstract Figure class
 */
public class Runner {

    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что хочешь добавить?\nВведи CIRCLE для создания круга.\nВведи RECTANGLE для создания прямоугольника.\nВведи TRIANGLE для создания треугольника\nВведи EXIT для окончания создания.");
        String line = scanner.nextLine();
        while (!line.equalsIgnoreCase(Const.WORD_TO_EXIT)) {
            if (line.equalsIgnoreCase("TRIANGLE")) figures.add(FabricTriangle.fabricTriangle());
            else if (line.equalsIgnoreCase("RECTANGLE")) figures.add(FabricRectangle.fabricRectangle());
            else if (line.equalsIgnoreCase("CIRCLE")) figures.add(FabricCircle.fabricCircle());
            else {
                System.out.println("Введенно неверное значение. Попробуй еще раз.");
                line = scanner.nextLine();
                continue;
            }
            System.out.println("Что хочешь добавить?\nВведи CIRCLE для создания круга.\nВведи RECTANGLE для создания прямоугольника.\nВведи TRIANGLE для создания треугольника\nВведи EXIT для окончания создания.");
            line = scanner.nextLine();
        }
        int count = 0;
        while (count != figures.size()) {
            System.out.println(figures.get(count).perimeter());
            count++;
        }
    }

}

