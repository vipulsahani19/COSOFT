# COSOFT
<br>
Project Title:

Number Guessing Game using Java


---

1. Introduction

This project is a simple Number Guessing Game developed using Java. It uses the Scanner and Random classes from Java’s utility package to implement an interactive console-based game. The user attempts to guess a randomly generated number between 1 and 100 within a limited number of attempts. The game gives hints like “Too low” or “Too high” after each guess and maintains a score for correct guesses.

This project demonstrates the use of loops, conditionals, user input handling, and random number generation in Java.


---

2. Main Objectives

1. To implement an interactive and fun number guessing game using Java.


2. To use loops and conditions to manage multiple attempts per round.


3. To handle invalid inputs using the Scanner class.


4. To keep track of score and rounds dynamically.


5. To practice and apply basic Java syntax and control structures in a real-use scenario.




---

3. Software & Tools Used

Programming Language: Java

Compiler/IDE: Eclipse / IntelliJ IDEA / VS Code / Terminal with javac

Input Method: Keyboard (via console)

Libraries Used:

java.util.Scanner for user input

java.util.Random for random number generation




---

4. System Design

The game is designed to run in the console with the following structure:

Random Number Generation:
Each round, a number between 1 and 100 is generated using Random.

User Input:
The user enters guesses through the keyboard using the Scanner object.

Attempt Logic:
Each round allows up to 10 guesses. After each incorrect guess, the game gives a hint (“Too low” or “Too high”).

Scoring:
If the user guesses correctly within the allowed attempts, the score is incremented.

Game Flow:
The game can continue for multiple rounds. The user decides whether to continue or exit after each round.



---

5. Functionalities Implemented

Random number generation between 1 and 100

Up to 10 attempts per round to guess correctly

Feedback on each guess: "Too low", "Too high", or "Correct"

Input validation: handles non-integer inputs gracefully

Score tracking and number of rounds played

Option to replay or exit the game

Displays final score when the game ends



---

6. Workflow

1. Game starts and welcomes the user.


2. A new round begins with a random number generated.


3. The user has up to 10 attempts to guess the number.


4. After each guess:

If incorrect, shows whether the guess was too low or too high.

If correct, congratulates the user and increases score.



5. After all attempts or a correct guess, shows score and round count.


6. Asks user whether to play another round.


7. If the user chooses “no”, game ends and final score is displayed.




---

7. Sample Input/Output

Sample 1:

Round 1 begins! Guess a number between 1 and 100:  
You have 10 attempts  
Attempt 1: Enter your guess: 50  
Too high!  
Attempt 2: Enter your guess: 25  
Too low!  
Attempt 3: Enter your guess: 33  
Correct! You guessed it in 3 attempts.  
Score: 1 | Rounds Played: 1  
Do you want to play another round? (yes/no): yes

Sample 2 (invalid input):

Attempt 1: Enter your guess: hello  
Please enter a valid number!


---

8. Advantages

Simple and effective console-based logic game.

Handles invalid input gracefully.

Encourages logical thinking with hints.

Easy to run on any Java-supported environment.

Shows usage of loops, input handling, and randomness in Java.



---

9. Limitations

Limited to console interface (no GUI).

No difficulty levels or scoring multipliers.

Maximum attempts and range are fixed.

No leaderboard or high-score saving.



---

10. Future Enhancements

Add a graphical user interface (GUI) using Swing or JavaFX.

Allow difficulty level selection (easy, medium, hard).

Save high scores to a file or database.

Add sound effects or animation for correct/incorrect guesses.

Limit response time for extra challenge.



---

11. Conclusion

The Number Guessing Game in Java is an excellent beginner-level project that teaches fundamental programming concepts such as loops, conditions, input handling, and randomness. The game is simple but engaging and can be enhanced with various features. It helps build a foundation for future Java programming projects and is suitable for academic or internship learning objectives.
