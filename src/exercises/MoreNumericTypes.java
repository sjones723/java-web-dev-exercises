package exercises;
import java.util.Scanner;
public class MoreNumericTypes {

    public static void main(String[]args){
        float gallons;
        float miles;
        float milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons were used?");
        gallons = input.nextFloat();
        System.out.println("How many miles driven?");
        miles = input.nextFloat();
        input.close();
        milesPerGallon = miles/gallons;
        System.out.println("Miles per gallon: "+milesPerGallon);

    }//end of main method
}//end of MoreNumericTypes class
