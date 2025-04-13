package com.kolapowariz;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello Wariz");
        byte age;
        age = 35;
        System.out.println(age);

        byte myAge = 30;
        System.out.println(myAge);

        long viewsCount = 3_123_456_789L;
        System.out.println(viewsCount);
        float price = 10.88F;
        System.out.println(price);
        char letter = 'A';
        System.out.println(letter);
        String myName = "Wariz";
        System.out.println(myName);
        boolean isEligible = false;
        System.out.println(isEligible);

        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 3);
        Point point2;
        point2 = point1;
        point1.x = 4;
        System.out.println(point2);

        // Strings
        String message = "  Hello World" + "!!  ";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);

        // Escape sequences
        String name = "Hello \"Wariz\"";
        System.out.println(name);

        String terminalPath = "c:\\windows\\...";
        System.out.println(terminalPath);

        String backslashN = "c:\nwindows\\...";
        System.out.println(backslashN);

        String backslashT = "c:\twindows\\...";
        System.out.println(backslashT);

        // Arrays
        int [] numbers = {3, 2, 1, 5, 6};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Length is " + numbers.length);

        // Multidimensional Array
        int[][] twoDimensionalArray = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        // Constant
        final float PI = 3.14F;
        System.out.println("PI result = " + PI);

        // Arithemetic expression
        int result = 10 + 3;
        System.out.println(result);

        double result2 = (double) 10 / (double)3;
        System.out.println(result2);

        // Increment and decrement operator
        int x = 1;
        x++;
        ++x;
        System.out.println(x);

        int y = 1;
        System.out.println(y);
        int z = y++;
        System.out.println(y);
        System.out.println(z);

        int k = 1;
        int l = ++k;
        System.out.println(k);
        System.out.println(l);

        // Augmented operator
        int j = 1;
        j +=2;
        System.out.println(j);

        // Order of operation
        int xOrder = 10 + 3 * 2;
        int yOrder = (10 + 3) * 2;
        System.out.println(xOrder);
        System.out.println(yOrder);

    }
}