package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    //A = pi * r * r where pi
    //The area of a circle of radius 2.5 is: 19.625
    public static void main(String [] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        var r = input.nextDouble();
        while(r<.00000001){
            System.out.print("Enter a radius: ");
            r = input.nextDouble();
        }

        double a = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + a);
    }
}
