package exercises.controlflow;
import java.util.ArrayList;
import java.util.Scanner;


public class arrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> randomlist = new ArrayList<>();
        randomlist.add(1);
        randomlist.add(2);
        randomlist.add(3);
        randomlist.add(4);
        randomlist.add(5);
        randomlist.add(6);
        randomlist.add(7);
        randomlist.add(8);
        randomlist.add(9);
        randomlist.add(10);
        System.out.println(sumAll(randomlist));
        ArrayList<String> randomWords = new ArrayList<>();
        randomWords.add("spruce");
        randomWords.add("roots");
        randomWords.add("growth");
        randomWords.add("maple");
        randomWords.add("cherry");
        randomWords.add("mulberry");
        randomWords.add("pine");
        randomWords.add("oak");
        fiveLetterWord(randomWords);
        wordLengthSearch(randomWords);

    }//main method

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

    public static void wordLengthSearch(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word length to search: ");
        int wordLength = input.nextInt();
        input.close();
        for(String ele:arr){
            if(ele.length()==wordLength){
                System.out.println(ele);
            }//if ==wordlength
        }//for ele:arr
    }//wordlengthSearch method



}
