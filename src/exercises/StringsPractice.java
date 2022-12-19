package exercises;
import java.util.Scanner;
public class StringsPractice {

    public static void main(String[]args){
        String searchTerm;
        Scanner input = new Scanner(System.in);
        String aliceIntro = "Alice was" +
                " beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into " +
                "the book her sister was reading, but it " +
                "had no pictures or conversations in " +
                "it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures " +
                "or conversation?'";

        System.out.println("Enter term to search in text:");
        searchTerm = input.next().toLowerCase();
        input.close();
        if(aliceIntro.toLowerCase().indexOf(searchTerm) !=-1){
            System.out.println(aliceIntro.toLowerCase().indexOf(searchTerm) !=-1);
/*Strings: Print out its index within the string and its length. Next, remove the word from the string and print the sentence again to confirm your code. Remember that strings are immutable, so you will need to reassign the old sentence variable or create a new one to store the updated phrase.*/
        System.out.println(aliceIntro.toLowerCase().indexOf(searchTerm));
        System.out.println(searchTerm.length());
        System.out.println(aliceIntro.toLowerCase().replace(searchTerm, ""));
        }//end if statement

    }// end of main class

}//end of StringsPractice class
