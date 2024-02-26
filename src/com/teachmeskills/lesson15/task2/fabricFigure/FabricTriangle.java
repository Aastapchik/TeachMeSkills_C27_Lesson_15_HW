package com.teachmeskills.lesson15.task2.fabricFigure;

import com.teachmeskills.lesson15.task2.figure.Figure;
import com.teachmeskills.lesson15.task2.figure.Triangle;
import com.teachmeskills.lesson15.task2.service.CheckDouble;

import java.util.Scanner;
/**
 * The class contains a method that generates objects of the triangle class
 */
public class FabricTriangle {

    public static Figure fabricTriangle(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первую сторону треугольника.");
            String a = scanner.nextLine();
            while (true) {
                if (CheckDouble.checkDigitString(a))
                    if (Double.parseDouble(a) > 0) break;
                System.out.println("Не является валидным значением. Повторите ввод.");
                a = scanner.nextLine();
            }

            System.out.print("Введите вторую сторону треугольника: ");
            String b = scanner.nextLine();
            while (true) {
                if (CheckDouble.checkDigitString(b))
                    if (Double.parseDouble(b) > 0) break;
                System.out.println("Не является валидным значением. Повторите ввод.");
                b = scanner.nextLine();
            }

            System.out.print("Введите третью сторону треугольника: ");
            String c = scanner.nextLine();
            while (true) {
                if (CheckDouble.checkDigitString(c))
                    if (Double.parseDouble(c) > 0) break;
                System.out.println("Не является валидным значением. Повторите ввод.");
                c = scanner.nextLine();
            }
            if ((Double.parseDouble(a) + Double.parseDouble(b) > Double.parseDouble(c)) && (Double.parseDouble(a) + Double.parseDouble(c) > Double.parseDouble(b)) && (Double.parseDouble(b) + Double.parseDouble(c) > Double.parseDouble(a))) {
                return new Triangle(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
            }
            System.out.println("Повторите ввод сторон.");
        }
    }
}
