package com.teachmeskills.lesson15.task2.fabricFigure;

import com.teachmeskills.lesson15.task2.figure.Figure;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.service.CheckDouble;

import java.util.Scanner;

/**
 * The class contains a method that generates objects of the rectangle class
 */
public class FabricRectangle {
    public static Figure fabricRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        String a = scanner.nextLine();
        while (true) {
            if(CheckDouble.checkDigitString(a))
                if(Double.parseDouble(a) > 0) break;
            System.out.println("Не является валидным значением. Повторите ввод.");
            a = scanner.nextLine();
        }
        System.out.print("Введите ширину прямоугольника: ");
        String b = scanner.nextLine();
        while (true) {
            if(CheckDouble.checkDigitString(b))
                if(Double.parseDouble(b) > 0) break;
            System.out.println("Не является валидным значением. Повторите ввод.");
            b = scanner.nextLine();
        }

        return new Rectangle(Double.parseDouble(a), Double.parseDouble(b));
    }
}
