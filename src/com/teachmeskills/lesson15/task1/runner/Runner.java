package com.teachmeskills.lesson15.task1.runner;

import com.teachmeskills.lesson15.task1.constants.Const;
import com.teachmeskills.lesson15.task1.service.CheckDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The class simulates the operation of a program to write numbers to a collection and output only the even ones
 */
public class Runner {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(true){
            if(CheckDigit.checkDigitString(line)) integers.add(Integer.parseInt(line));
            else if(line.equalsIgnoreCase(Const.WORD_TO_EXIT)) break;
            else System.out.println("Не является числом или ключевым словом. Продолжайте ввод.");
            line = scanner.nextLine();
        }
        int count = 0;
        while(count != integers.size())
        {
            if(integers.get(count) % 2 == 0) System.out.print(integers.get(count) + " ");
            count++;
        }
    }
}
