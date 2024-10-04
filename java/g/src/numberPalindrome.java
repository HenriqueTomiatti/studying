import java.util.Scanner;

public class numberPalindrome {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.print("type a number and discovery if it is a palindrome or not --> ");

        int x = scanner.nextInt();

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            System.out.println("is not a palindrome");
        }

       int reversedHalf = 0;

        while(x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;

            x /= 10;
        }
        if (x == reversedHalf || x == reversedHalf / 10) {
            System.out.print("the number is a palindrome");
        } else {
            System.out.print("the number is not a palindrome");
        }
    }
}
