package com.company;

public class CharCounter {

    public static long countChar(String inputString, char ch) {
	// write your code here
        return inputString.chars().filter(num -> num == ch).count();
    }
}
