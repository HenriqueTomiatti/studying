import 'dart:io';
import 'dart:math';

void main() {
  var guess = 0;
  var attempt = 10;
  bool game = true;
  int randomNumber = Random().nextInt(100) + 1;

  while (game && attempt > 0) {
    stdout.write("type a number to 1 to 100 --> ");
    guess = int.parse(stdin.readLineSync()!);

    if (guess == randomNumber) {
      print("You win!");
      game = false;
    } else if (guess > randomNumber) {
      print("the number is smaller");
    } else {
      print("the number is greater");
    }

    attempt--;
    if (attempt == 0 && game) {
      print("you lose, the number is ${randomNumber}");
      game = false;
    } else {
      print('you have: $attempt');
    }
  }
}
//:)
