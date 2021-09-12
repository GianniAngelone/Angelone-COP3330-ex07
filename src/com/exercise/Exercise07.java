/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;

class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we take in the input from a user
        System.out.print("What is the length of the room in feet? ");
        String length = input.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = input.nextLine();
        System.out.print(String.format("You entered the dimensions of %s feet by %s feet\n", length, width));
        //Since we can't do math with strings, we have to convert it
        int Length = Integer.parseInt(length);
        int Width = Integer.parseInt(width);
        int area = Length * Width;
        double meters = area * 0.09290304;

        System.out.print(String.format("The area is \n%d square feet\n%.3f square meters", area, meters));

    }
}
