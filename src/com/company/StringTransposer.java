package com.company;

public class StringTransposer {
    public static  String tranposeString(String inputString){
        String[] stringArray = inputString.split(" ");
        String outputString ="";

        for(String s:stringArray){
            StringBuffer buffer = new StringBuffer(s);
            buffer.reverse();
            outputString = outputString + " " + buffer.toString();
        }
        return outputString.trim();
    }
}
