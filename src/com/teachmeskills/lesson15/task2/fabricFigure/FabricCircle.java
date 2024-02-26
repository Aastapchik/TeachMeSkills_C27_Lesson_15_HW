package com.teachmeskills.lesson15.task2.fabricFigure;

import com.teachmeskills.lesson15.task1.constants.Const;
import com.teachmeskills.lesson15.task1.service.CheckDigit;
import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Figure;
import com.teachmeskills.lesson15.task2.service.CheckDouble;

import java.util.Scanner;

/**
 * The class contains a method that generates objects of the circle class
 */
public class FabricCircle {

    public static Figure fabricCircle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        String R = scanner.nextLine();
        while (true) {
            if(CheckDouble.checkDigitString(R))
                if(Double.parseDouble(R) > 0) break;
            System.out.println("Не является валидным значением. Повторите ввод.");
            R = scanner.nextLine();
        }
        return new Circle(Double.parseDouble(R));
    }

}
