package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String userName;
        int firstNumber, secondNumber, answer1;


        System.out.println("What is your name");
        userName = keyboard.nextLine();
        System.out.println("Can you please give me one number");
        firstNumber = keyboard.nextInt();
        System.out.println("can you please give me one number");
        secondNumber = keyboard.nextInt();
        System.out.println(firstNumber + " times " + secondNumber + " equals " + mulitiply(firstNumber, secondNumber));

        printGreeting("World");

        helloName("" + userName);

        System.out.println(firstNumber * secondNumber);

    }


    public static void printGreeting(String noun) {
        System.out.println("Hello " + noun);
    }

    public static void helloName(String userName) {
        System.out.println("Hello " + userName);
    }

    public static int mulitiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}