package com.teachmeskills.lesson15.task3.runner;

import com.teachmeskills.lesson15.task1.constants.Const;
import com.teachmeskills.lesson15.task1.service.CheckDigit;
import com.teachmeskills.lesson15.task2.service.CheckDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The class method executes a program to fill the collection with a limited number of elements and display their arithmetic mean
 */
public class Runner {

    public static void main(String[] args) {

        System.out.print("Введи количество элементов в коллекции: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (true) {
            if (CheckDigit.checkDigitString(line))
                if (Integer.parseInt(line) > 0) break;
            System.out.println("Не является валидным значением. Повторите ввод.");
            line = scanner.nextLine();
        }

        int count = 0;

        List<Integer> integers = new ArrayList<>(Integer.parseInt(line));

        while (integers.size() < Integer.parseInt(line)) {
            System.out.print("Введи " + (count + 1) + " число: ");
            String k = scanner.nextLine();
            while (!CheckDigit.checkDigitString(k)) {
                System.out.println("Не является целым числом. Повторите ввод.");
                k = scanner.nextLine();
            }
            integers.add(Integer.parseInt(k));
            count++;
        }
        int sum = 0;
        count = 0;
        while (count != integers.size()) {
            sum += integers.get(count);
            count++;
        }
        float q = (float) sum / Integer.parseInt(line);
        System.out.println("Среднее арифметическое равно " + q);
    }
}
