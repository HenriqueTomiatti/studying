import random

guess = 0
attempt = 10
game = True
random_number = random.randint(1, 100)

while game:
    guess = int(input("Type a number to 1 to 100 -->"))

    if guess == random_number:
        print("You win")
        game = False
    elif guess > random_number:
        print("the number is smaller")
    else:
        print("the number is greater")

        attempt -= 1
        if attempt == 0:
            print(f"you lose the number is: {random_number}")
            game = False
        else:
            print(f"you have {attempt} chances")
