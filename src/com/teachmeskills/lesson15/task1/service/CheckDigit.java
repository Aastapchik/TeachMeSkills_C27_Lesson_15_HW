package com.teachmeskills.lesson15.task1.service;

public class CheckDigit {
    public static boolean checkDigitString(String s)
    {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
            if(!Character.isDigit(chars[i])) return false;
        return true;
    }
}
