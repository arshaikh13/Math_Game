Purpose:
The purpose of this program is to create an interactive math game for the user. The game allows the user to select different types of math problems (addition, subtraction, multiplication, division, or a random mix) and choose the difficulty level (easy or hard). The program then generates math questions based on the user's choices and evaluates the user's answers.

Program Overview:
The program begins by asking the user to choose a problem type (from 1 to 5) and a problem level (1 for easy, 2 for hard). It repeatedly prompts the user until valid choices are made.

It maintains a count of the number of correct answers, which starts at zero.

For a total of 10 rounds, it generates math questions based on the user's choices. The type of question (addition, subtraction, multiplication, or division) depends on the user's selection, and the numbers in the questions are randomly generated.

The user is prompted to input their answer to each question.

After each user input, the program checks if the answer is correct. If it is correct, it provides positive feedback with random messages like "Good Job!" or "Awesome Work!" If the answer is incorrect, it provides constructive feedback and reveals the correct answer.

If the user enters an invalid input, the program handles this by providing an error message and allows the user to try the same question again.

After 10 rounds of questions, the program displays the total number of correct answers.

The program then asks the user if they want to play the game again. If the user chooses to continue, the loop starts over. If the user chooses to quit, the program says "Good Bye!" and exits.
