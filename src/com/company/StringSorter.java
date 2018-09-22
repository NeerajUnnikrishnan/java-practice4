package com.company;

public class StringSorter {
    public static String[] sort(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++)
        {
            for (int j = i + 1; j < stringArray.length; j++)
            {
                if (stringArray[i].compareTo(stringArray[j])>0)
                {
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }

        return stringArray;
    }
}
