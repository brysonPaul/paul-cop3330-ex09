/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        final int GALLON_PAINT_COVER_IN_SQUARE_FT = 350;
        int length = 0,width = 0,area = 0, amtOfGalsNeeded = 0;
        while(true) {
            try {
                length = Integer.parseInt( strIO("Enter the length: ",sc));
                width = Integer.parseInt( strIO("Enter the width: ",sc));
            } catch(Exception ex) {
                System.out.println("Enter numeric values only");
                continue;
            }
            break;
        }
        area=length * width;
        int areaHold=area;
        while(areaHold >= GALLON_PAINT_COVER_IN_SQUARE_FT) {
            areaHold -= GALLON_PAINT_COVER_IN_SQUARE_FT;
            amtOfGalsNeeded++;
        }
        if(areaHold > 0)
        {
            amtOfGalsNeeded++;
        }
        System.out.println("You will need to purchase "+ amtOfGalsNeeded + " gallons of paint to cover " + area + " square feet.");

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
