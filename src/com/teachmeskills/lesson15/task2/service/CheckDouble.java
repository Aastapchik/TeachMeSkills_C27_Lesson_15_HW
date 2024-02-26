package com.teachmeskills.lesson15.task2.service;

public class CheckDouble {

    public static boolean checkDigitString(String s)
    {
        char[] chars = s.toCharArray();
        for (char aChar : chars) if (!Character.isDigit(aChar) && aChar != '.') return false;
        return true;
    }
}
