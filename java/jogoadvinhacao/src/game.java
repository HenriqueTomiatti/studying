import java.util.Random;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        var guess = 0;
        var attempt = 10;
        boolean game = true;
        Scanner typeNumber = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        while (game) {
            System.out.print("Type a number to 1 to 100 --> ");
            String number = typeNumber.next();
            guess = Integer.parseInt(number);

            if (guess == randomNumber) {
                System.out.println("you win");
                game = false;
            } else if (guess > randomNumber) {
                System.out.println("the number is smaller");
            } else {
                System.out.println("the number is greater");
            }

            attempt--;
            if (attempt == 0) {
                System.out.printf("you lose, the number is %s", randomNumber);
                game = false;
            } else {
                System.out.printf("You have %s:\n", attempt, "chances");
            }
        }
        typeNumber.close();
    }
}
