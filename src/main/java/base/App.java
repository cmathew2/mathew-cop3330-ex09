/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();

        //number conversion
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);

        //math and unit conversion
        int area = l * w;
        double conv = 350;
        //round up
        double gallon = Math.ceil(area / conv);

        //output
        System.out.println("You will need to purchase " + gallon + " gallons of paint to cover " + area + " square feet.");
    }
}
