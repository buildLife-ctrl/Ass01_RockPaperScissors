import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        String inputMoveA;
        String inputMoveB;
        boolean validInput = false;
        String continYN = "";

        do { //runs the game until the player wants to stop
            do { //checks for valid input from player A
                //asks player A to input move
                System.out.println("What is player A's move? Pick R for rock, P for paper, or S for scissors.");
                inputMoveA = scan.nextLine();
                if (inputMoveA.equalsIgnoreCase("r") || inputMoveA.equalsIgnoreCase("p") || inputMoveA.equalsIgnoreCase("s")) {
                    do { //checks for valid input from player B
                        //asks player B to input move
                        System.out.println("What is player B's move? Pick \"R\" for rock, \"P\" for paper, or \"S\" for scissors.");
                        inputMoveB = scan.nextLine();
                        if (inputMoveB.equalsIgnoreCase("r") || inputMoveB.equalsIgnoreCase("p") || inputMoveB.equalsIgnoreCase("s")) {
                            if (inputMoveA.equalsIgnoreCase("r") && inputMoveB.equalsIgnoreCase("p")) {
                                System.out.println("Paper covers Rock, player B wins!");
                            } else if (inputMoveA.equalsIgnoreCase("p") && inputMoveB.equalsIgnoreCase("r")) {
                                System.out.println("Paper covers Rock, player A wins!");
                            } else if (inputMoveA.equalsIgnoreCase("r") && inputMoveB.equalsIgnoreCase("s")) {
                                System.out.println("Rock breaks Scissors, player A wins!");
                            } else if (inputMoveA.equalsIgnoreCase("s") && inputMoveB.equalsIgnoreCase("r")) {
                                System.out.println("Rock breaks Scissors, player B wins!");
                            } else if (inputMoveA.equalsIgnoreCase("s") && inputMoveB.equalsIgnoreCase("p")) {
                                System.out.println("Scissors cut Paper, player A wins!");
                            } else if (inputMoveA.equalsIgnoreCase("p") && inputMoveB.equalsIgnoreCase("s")) {
                                System.out.println("Scissors cut Paper, player B wins!");
                            } else {
                                System.out.println("It's a tie!");
                            }
                            validInput = false; //so that the system can ask if they want to continue

                            do { //checks if the input for continue is valid
                                //asks if they want to continue
                                System.out.println("Would you like to continue? Enter either \"Y\" for yes or \"N\" for no.");
                                continYN = scan.nextLine();
                                if (continYN.equalsIgnoreCase("y") || continYN.equalsIgnoreCase("n")) {
                                    validInput = true;
                                }
                            } while (!validInput);
                        } else {
                            System.out.println("Please input the R, P, or S.");
                        }
                    } while (!validInput);
                } else {
                    System.out.println("Please input the R, P, or S.");
                }
            } while (!validInput);
        } while (continYN.equalsIgnoreCase("y"));

        System.exit(0); //terminates since the players do not want to continue
    }
}