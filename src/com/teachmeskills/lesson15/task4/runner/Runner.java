package com.teachmeskills.lesson15.task4.runner;

import com.teachmeskills.lesson15.task4.constants.Const;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * The class method does the work of populating the collection with unique values, such as the names of the students in the group
 */
public class Runner {

    public static void main(String[] args) {

        Set<String> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(students.size() < Const.NUMBER_STUDENTS_OF_GROUP){
            System.out.print("Введите " + (count + 1) + " студента: ");
            students.add(scanner.nextLine());
            count++;
        }

            System.out.println(students);

    }
}
