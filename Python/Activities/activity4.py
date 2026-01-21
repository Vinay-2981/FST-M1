"""
user1 = input("Vikram")
user2 = input("Raju")

while True:
    user1_text = input(user1 + ",Rock").lower()
    user2_text = input(user2 + ",Paper").lower()
    if user1_text == user2_text:
        print("it's a Tie")
    elif user1_text == 'Rock':
        if user2_text == 'scissors':
            print("Rock Wins!")
        else:
            print("Scissors Wins!")
    elif user1_text == 'scissors':
        if user2_text == 'paper':
            print("scissors Wins!")
        else:
            print("paper Wins!")
    elif user1_text == 'paper':
        if user2_text == 'rock':
            print("paper Wins!")
        else:
            print("rock Wins!")

    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if (repeat == "Yes"):
        pass
    elif(repeat == "No"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit

   """   
# Get the names of the users
user1 = input("Vikram")
user2 = input("Ram")

# While looping endlessly
while True:
    # Ask User1's choice
    user1_answer = input(user1 + ",rock").lower()
    
    # Ask User2's choice
    user2_answer = input(user2 + ",scissors").lower()
    
    # Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit  
