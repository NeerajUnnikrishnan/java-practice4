package com.company;

public class StringMatcher {
    public static int matchString(String inputString, String word){
        int index = inputString.indexOf(word);
        System.out.println(index);
        return index;
    }
}
