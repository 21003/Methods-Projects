package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner (System.in);

        String userName;

        System.out.println("What is your name ? ");
        userName = keyboard.nextLine();

        printGreeting("World");

        helloName( "" + userName);

    }

    public static void printGreeting(String noun){
        System.out.println("Hello "+noun);

    }
      



}

