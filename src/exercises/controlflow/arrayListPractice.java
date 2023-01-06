package exercises.controlflow;
import java.util.ArrayList;
public class arrayListPractice {

    //static method: find sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.

    public static int sumAll(ArrayList<Integer> arr){
        int total = 0;
        for(int ele:arr){
            if(ele%2==0){
                total+=ele;
            }//if even
        }//for ele:arr
        return total;
    }

    //Write a static method to print out each word in a list that has exactly 5 letters.
    public static void fiveLetterWord(ArrayList<String> arr){
        for(String ele:arr){
            if(ele.length()==5){
                System.out.println(ele);
            }//if ele.length() ==5
        }//for ele:arr
    }

    //Modify your code to prompt the user to enter the word length for the search.


}
