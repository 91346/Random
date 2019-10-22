import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myWord = "TURTLE";
        System.out.println("Guess the six letter word:");
        String myGuess = input.nextLine();
        myGuess = myGuess.toUpperCase();
        while (!myGuess.equals("TURTLE")){
            for (int i = 0; i < myGuess.length(); i++){
                if (myGuess.charAt(i) == myWord.charAt(i)){
                    System.out.print(myGuess.charAt(i));
                } else {
                    System.out.print("?");
                }
            }
            System.out.println(" ");
            System.out.println("Guess the six letter word:");
            myGuess = input.nextLine();
            myGuess = myGuess.toUpperCase();
        }
        System.out.println("Correct the word was TURTLE");
    }
}
