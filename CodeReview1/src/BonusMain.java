package com.company;

import java.util.Scanner;

public class BonusMain {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input width: ");
        int width = myScanner.nextInt();
        System.out.println("Input height: ");
        int height = myScanner.nextInt();

        int area = width*height;

        System.out.println("The are for your input is: " +area);

    }
}
