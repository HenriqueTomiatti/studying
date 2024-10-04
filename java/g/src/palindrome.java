import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("write a word or phrase and discover if it is a palindrome or not -->  ");

        String original = scanner.nextLine();

        original = original.replaceAll("\\s+", "").toLowerCase();

        String inverted = new StringBuilder(original).reverse().toString();
//        System.out.println(inverted);
        if (inverted.equals(original)) {
            System.out.print(STR."the word/phrase \{original} is a palindrome");
        } else {
            System.out.print(STR."the word/phrase \{original} is not a palindrome");
        }
        scanner.close();
    }

/*
You'll enter the word or phrase as input
The line [original = original.replaceAll("\\s+", "").toLowerCase();] takes the word typed in the input, removes all spaces, and converts uppercase letters to lowercase
The line String [inverted = new StringBuilder(original).reverse().toString();] inverts the original string
The if/else comparison verifies if the strings are the same. I use the equals method to compare them
*/
}