package com.kolapowariz;

import java.text.NumberFormat;
import java.util.Scanner;

public class More {

    public static void main(String[] args) {
        // Casting
        // Implicit casting
        // byte > short > int > long > float > double
        short a = 1;
        int b = a + 2;
        System.out.println(b);

        // Explicit casting
        double c = 1.1;
        int d = (int)c + 2;
        System.out.println(d);

        String e = "1";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);

        String g = "1.1";
        double h = Double.parseDouble(g) + 2;
        System.out.println(h);

        // Math method
        int i = Math.round(1.1F);
        System.out.println(i);

        int j = (int)Math.ceil(1.1F);
        System.out.println(j);

        int k = (int) Math.floor(1.1F);
        System.out.println(k);

        int l = Math.max(1, 3);
        System.out.println(l);

        int m = Math.min(1, 4);
        System.out.println(m);

        double n = Math.random();
        System.out.println(n);

        int o = (int) Math.round(Math.random() * 100);
        System.out.println(o);

        int p = (int) (Math.random() * 100);
        System.out.println(p);



        // Formatting numbers
        // Currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String r = currency.format(123456.789);
        System.out.println(r);

        // Percentage
        String s = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(s);


        // Comparison Operator
        int x = 2;
        int y = 2;

        System.out.println(x >= y);

        // Logical Operator

        // And operator &&
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 10;
        System.out.println(isWarm);

        // Or operator ||
        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);


        // Not operator !
        System.out.println(!isEligible);

        // if statements
        int temp = 22;

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }


        // Simplifying if statement
        int income = 120_000;
        boolean hasHighIncome2 = income > 100_000;
        System.out.println(hasHighIncome2);

        // Ternary Operator
        int income2 = 120_000;
        String className = income2 > 100_000 ? "First" : "Second";
        System.out.println(className);


        // Switch statement
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "Moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        // For loops
        for (int ij = 0; ij < 5; ij++)
            System.out.println("Hello World!!! " + ij);

        for (int ij = 5; ij > 0; ij--)
            System.out.println(ij);


        // while loops
        int jk = 0;
        while (jk < 5) {
            System.out.println("while loop " + jk);
            jk++;
        }

        int ij = 5;
        while (ij > 0) {
            System.out.println("While loop " + ij);
            ij--;
        }


        Scanner scannerLoop = new Scanner(System.in);
        String input = "";
        int principal = 0;

        while (!input.equals("quit")) {
            System.out.print("Input ");
            input = scannerLoop.next().toLowerCase();
            System.out.println(input);
        }

        while (principal < 1000 || principal > 1000000){
            System.out.print("Principal ");
            principal = scannerLoop.nextInt();
            if (principal < 1000)
                continue;
            System.out.println("Enter a value greater than 1000 and lesser than 1_000_000");
        }


        // Do While loop
        do {
            System.out.print("Input ");
            input = scannerLoop.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));


        // Break statement
        while (true) {
            System.out.print("Input ");
            input = scannerLoop.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }



        // For Each loop
        String [] fruits = { "Apple", "Mango", "Orange"};

        for (int il = 0; il < fruits.length; il++){
            System.out.println("For loop " + fruits[il]);
        }

        for(String fruit : fruits)
            System.out.println("For each loop " + fruit);


        String message = greetUser("Wariz", "Kolapo");
        System.out.println(message);
//        fizzbuzz();
//        input();
    }

    public static String greetUser (String firstname, String lastname) {
        return "Hello " + firstname + " " + lastname + ". This is a method";
    }


    public static void input() {
        System.out.println("this is the input method");

        // Reading user input with Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        Scanner scannerString = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scannerString.nextLine().trim();
        System.out.println("You name is " + name);
    }



    // fizzbuzz
    public static void fizzbuzz() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if(number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

    }

}
