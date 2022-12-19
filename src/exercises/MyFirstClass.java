package exercises;

import java.util.Scanner;

public class MyFirstClass {
/**
 * public static returnedDataType methodName(parameterDataType parameterName) {
 * //code
 * }
 */
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.next();
        input.close();

        System.out.println("Hello, " + name);
    }
}
