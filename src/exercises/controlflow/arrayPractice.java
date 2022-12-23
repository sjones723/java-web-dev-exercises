package exercises.controlflow;

import java.util.Arrays;
public class arrayPractice {

    public static void main(String[]args){
        int[] anArray = {1, 1, 2, 3, 5, 8};
        //Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for(int i:anArray){
            System.out.print(i);
        }//for i in anArray
        System.out.println(" ");
        System.out.println("*******************");
        for(int i:anArray){
            if(i%2!=0){
            System.out.print(i);}//if not even
        }//for i in anArray Odd numbers
        // Use the split method, divide string at space and store the individual words in an array.
        System.out.println(" ");
        System.out.println("*******************");
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] phraseArray = phrase.split(" ");
        System.out.println(Arrays.toString(phraseArray));
// change the delimiter to split the string into separate sentences.
        String [] phraseArrayCommaSplit = phrase.split(",");
        System.out.println(Arrays.toString(phraseArrayCommaSplit));

    }//main method
}//main class
