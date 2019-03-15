package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String userWord3;
        String userName;
        String userWord1;
        String userWord2;
        int firstNumber, secondNumber, fifthNumber, sixthNumber;
        double thirdNumber, fourthNumber;


        System.out.println("What is your name");
        userName = keyboard.nextLine();

        System.out.println("Can you please give me two number to muliply");
        System.out.println("Can you please give me the first number");
        firstNumber = keyboard.nextInt();
        System.out.println("Can you please give me second number");
        secondNumber = keyboard.nextInt();
        System.out.println(firstNumber + " times " + secondNumber + " equals " + mulitiply(firstNumber, secondNumber));
        System.out.println(firstNumber * secondNumber);

        System.out.println ("Can you please give me two numbers to divide");
        System.out.println("Can you please give me the first number");
        thirdNumber = keyboard.nextDouble();
        System.out.println("Can you please give me second number");
        fourthNumber = keyboard.nextDouble();
        System.out.println(thirdNumber + " divided " + fourthNumber + " equals " + divide(thirdNumber, fourthNumber));
        System.out.println(thirdNumber / fourthNumber);

        System.out.println("Can you please give me two final numbers");
        System.out.println("Can you please give me one number");
        fifthNumber = keyboard.nextInt();
        System.out.println("Can you please give me a second number");
        sixthNumber = keyboard.nextInt();

        if (fifthNumber > sixthNumber){
            System.out.println(fifthNumber+ " is the bigger of the two numbers");
        }
        if (fifthNumber < sixthNumber) {
            System.out.println(sixthNumber + " is the bigger of the two numbers");

        }


        userWord3 = ("Beach The");




        printGreeting("World");

        helloName("" + userName);

        flip ("" + userWord3);



    }


    public static void printGreeting(String noun) {
        System.out.println("Hello " + noun);
    }

    public static void helloName(String userName) {
        System.out.println("Hello " + userName);
    }

    public static int mulitiply(int firstNumber, int secondNumber){
      return firstNumber * secondNumber;
   }

    public static double divide(double thirdNumber, double fourthNumber){
        return thirdNumber / fourthNumber;
    }

    public static int max(int fifthNumber , int sixthNumber){
        return fifthNumber ;
    }
    public static void flip(String noun2){
        System.out.println("I will now switch the placement of the words 'The Beach'");
        System.out.println(noun2);
    }
}
