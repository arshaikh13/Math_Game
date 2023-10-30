import java.util.Scanner;
import java.util.Random;

public class MathGame {
    public static void main(String[] args) {
        int userProbType, probType, level;
        int op1 = 0, op2 = 0, correctAnswer = 0, studentAnswer, randChoice = 0;
        int numCorrect;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        // Main loop for the game, allows the player to play again if desired
        do {
            // User selects the problem type (1-5)
            do {
                try {
                    System.out.print("Choose a problem type 1-5: ");
                    userProbType = input.nextInt();
                    if (userProbType < 1 || userProbType > 5) {
                        System.out.println("Please enter a valid number!");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine();
                    userProbType = 0;
                }
            } while (userProbType < 1 || userProbType > 5);

            // User selects the problem level (1-2)
            do {
                try {
                    System.out.print("Choose a problem level 1-2: ");
                    level = input.nextInt();
                    if (level < 1 || level > 2) {
                        System.out.println("Please enter a valid number!");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine();
                    level = 0;
                }
            } while (level < 1 || level > 2);

            numCorrect = 0; // Initialize the number of correct answers to 0

            // Loop for asking 10 questions
            for (int i = 1; i <= 10; i++) {
                if (userProbType == 1) {
                    probType = 1;
                } else if (userProbType == 2) {
                    probType = 2;
                } else if (userProbType == 3) {
                    probType = 3;
                } else if (userProbType == 4) {
                    probType = 4;
                } else {
                    probType = 5;
                }

                // Generate random operands based on the selected level
                switch (level) {
                    case 1:
                        op1 = random.nextInt(10);
                        op2 = random.nextInt(10);
                        break;
                    case 2:
                        op1 = random.nextInt(100);
                        op2 = random.nextInt(100);
                        break;
                }

                                 // Switch statement to handle different problem types
                switch (probType) {
                    case 1:
                        correctAnswer = (op1 + op2);
                        System.out.print("Question " + i + ": " + op1 + " + " + op2 + " = ");
                        try {
                            studentAnswer = input.nextInt();
                            if (studentAnswer == correctAnswer) {
                                numCorrect++;
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("Good Job!");
                                } else if (randChoice == 1) {
                                    System.out.println("Awesome Work!");
                                } else {
                                    System.out.println("You're right!");
                                }
                            } else {
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("That's Wrong!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else if (randChoice == 1) {
                                    System.out.println("Try Again!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else {
                                    System.out.println("Not Quite!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                }
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            input.nextLine();
                            i--;
                        }
                        break;

                    case 2:
                        if (op1 < op2) {
                            op1 = op1 ^ op2;
                            op2 = op1 ^ op2;
                            op1 = op1 ^ op2;
                        }
                        correctAnswer = (op1 - op2);
                        System.out.print("Question " + i + ": " + op1 + " - " + op2 + " = ");
                        try {
                            studentAnswer = input.nextInt();
                            if (studentAnswer == correctAnswer) {
                                numCorrect++;
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("Good Job!");
                                } else if (randChoice == 1) {
                                    System.out.println("Awesome Work!");
                                } else {
                                    System.out.println("You're right!");
                                }
                            } else {
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("That's Wrong!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else if (randChoice == 1) {
                                    System.out.println("Try Again!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else {
                                    System.out.println("Not Quite!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                }
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            input.nextLine();
                            i--;
                        }
                        break;

                    case 3:
                        correctAnswer = (op1 * op2);
                        System.out.print("Question " + i + ": " + op1 + " * " + op2 + " = ");
                        try {
                            studentAnswer = input.nextInt();
                            if (studentAnswer == correctAnswer) {
                                numCorrect++;
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("Good Job!");
                                } else if (randChoice == 1) {
                                    System.out.println("Awesome Work!");
                                } else {
                                    System.out.println("You're right!");
                                }
                            } else {
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("That's Wrong!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else if (randChoice == 1) {
                                    System.out.println("Try Again!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else {
                                    System.out.println("Not Quite!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                }
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            input.nextLine();
                            i--;
                        }
                        break;

                    case 4:
                        if (op2 == 0) {
                            op1 = op1 ^ op2;
                            op2 = op1 ^ op2;
                            op1 = op1 ^ op2;
                        }
                        correctAnswer = (op1 / op2);
                        System.out.print("Question " + i + ": " + op1 + " / " + op2 + " = ");
                        try {
                            studentAnswer = input.nextInt();
                            if (studentAnswer == correctAnswer) {
                                numCorrect++;
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("Good Job!");
                                } else if (randChoice == 1) {
                                    System.out.println("Awesome Work!");
                                } else {
                                    System.out.println("You're right!");
                                }
                            } else {
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("That's Wrong!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else if (randChoice == 1) {
                                    System.out.println("Try Again!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else {
                                    System.out.println("Not Quite!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                }
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            input.nextLine();
                            i--;
                        }
                        break;

                    case 5:
                        randChoice = random.nextInt(5);
                        if (randChoice == 1) {
                            correctAnswer = (op1 + op2);
                            System.out.print("Question " + i + ": " + op1 + " + " + op2 + " = ");
                        } else if (randChoice == 2) {
                            if (op1 < op2) {
                                op1 = op1 ^ op2;
                                op2 = op1 ^ op2;
                                op1 = op1 ^ op2;
                            }
                            correctAnswer = (op1 - op2);
                            System.out.print("Question " + i + ": " + op1 + " - " + op2 + " = ");
                        } else if (randChoice == 3) {
                            correctAnswer = (op1 * op2);
                            System.out.print("Question " + i + ": " + op1 + " * " + op2 + " = ");
                        } else {
                            if (op2 == 0) {
                                op1 = op1 ^ op2;
                                op2 = op1 ^ op2;
                                op1 = op1 ^ op2;
                            }
                            correctAnswer = (op1 / op2);
                            System.out.print("Question " + i + ": " + op1 + " / " + op2 + " = ");
                        }

                        try {
                            studentAnswer = input.nextInt();
                            if (studentAnswer == correctAnswer) {
                                numCorrect++;
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("Good Job!");
                                } else if (randChoice == 1) {
                                    System.out.println("Awesome Work!");
                                } else {
                                    System.out.println("You're right!");
                                }
                            } else {
                                randChoice = random.nextInt(3);
                                if (randChoice == 0) {
                                    System.out.println("That's Wrong!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else if (randChoice == 1) {
                                    System.out.println("Try Again!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                } else {
                                    System.out.println("Not Quite!");
                                    System.out.println("The correct answer is: " + correctAnswer);
                                }
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            input.nextLine();
                            i--;
                        }
                        break;
                }
            }

            // Display the number of correct answers
            System.out.println("You answered " + numCorrect + " questions correctly!");

            // Ask if the player wants to play again
            System.out.print("Enter 'Y' to continue, or 'N' to end the game! ");
            String gameOption = input.next();

            if (gameOption.equalsIgnoreCase("Y")) {
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("Good Bye!");
            }

        } while (playAgain); // Loop as long as the player wants to play again
    }
}
