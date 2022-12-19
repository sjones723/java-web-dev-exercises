package exercises;

import java.util.Scanner;
public class NumericTypes {
    public static void main(String[]args){
    int length;
    int width;
    int area;
    String areaMessage;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        length = input.nextInt();
        System.out.println("Enter width:");
        width = input.nextInt();
        input.close();
        area = length * width;
        areaMessage = "The area is " + area;
        System.out.println(areaMessage);
    }//end of main method
}//end of Numeric Types class
