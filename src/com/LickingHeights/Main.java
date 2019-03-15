package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String userName;
        int firstNumber, secondNumber, fifthNumber, sixthNumber;
        double thirdNumber, fourthNumber;


        System.out.println("What is your name");
        userName = keyboard.nextLine();

        System.out.println("Can you please give me two number to muliply");
        System.out.println("Can you please give me the first number");
        firstNumber = keyboard.nextInt();
        System.out.println("can you please give me second number");
        secondNumber = keyboard.nextInt();
        System.out.println(firstNumber + " times " + secondNumber + " equals " + mulitiply(firstNumber, secondNumber));

        System.out.println ("Can you please give me two numbers to divide");
        System.out.println("Can you please give me the first number");
        thirdNumber = keyboard.nextDouble();
        System.out.println("can you please give me second number");
        fourthNumber = keyboard.nextDouble();
        System.out.println(thirdNumber + " divided " + fourthNumber + " equals " + divide(thirdNumber, fourthNumber));

        System.out.println("Can you please give me numbers so I can find the bigger one");
        System.out.println("Can you please give me the first number");
        fifthNumber = keyboard.nextInt();
        System.out.println("can you please give me second number");
        sixthNumber = keyboard.nextInt();
                System.out.println("The bigger number between "+fifthNumber+" and "+sixthNumber+" is ");






        printGreeting("World");

        helloName("" + userName);

        System.out.println(firstNumber * secondNumber);
        System.out.println(thirdNumber / fourthNumber);
        System.out.println(fifthNumber ^ ((fifthNumber ^ sixthNumber)& - (fifthNumber << sixthNumber));

    }


    public static void printGreeting(String noun) {
        System.out.println("Hello " + noun);
    }

    public static void helloName(String userName) {
        System.out.println("Hello " + userName);
    }

   
    }

    public static double divide(double thirdNumber, double fourthNumber){
        return thirdNumber / fourthNumber;

    }
    public static int max(int fifthNumber, int sixthNumber){
        return (fifthNumber ^ ((fifthNumber ^ sixthNumber)& - (fifthNumber << sixthNumber));





}
