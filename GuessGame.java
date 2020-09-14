public class GuessGame {
    Player PlayerOne;
    Player PlayerTwo;
    Player PlayerThree;
    //Creates a new object in Player class

    public void startGame() {
        PlayerOne = new Player();   //Also referred to as P1
        PlayerTwo = new Player();   //Also referred to as P2
        PlayerThree = new Player(); //Also referred to as P3
        //Creates a variable in this file to store values for each player

        int P1Guess = 0;
        int P2Guess = 0;
        int P3Guess = 0;
        //Initialises the integer required for each player's guess

        boolean P1Correct = false;
        boolean P2Correct = false;
        boolean P3Correct = false;
        //Initialises the integer required to determine if a player is correct

        int targetNum = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        //Creates a random number between 0 and 9

        while(true) { //Creates an infinite while loop until broken by a correct answer
            System.out.println("The correct number is " + targetNum);
        
            PlayerOne.guess();
            PlayerTwo.guess();
            PlayerThree.guess();
            //Retrieves the guessNum from Player class

            P1Guess = PlayerOne.guessNum;
            System.out.println("Player One guess the number: " + P1Guess);
            P2Guess = PlayerTwo.guessNum;
            System.out.println("Player Two guess the number: " + P2Guess);
            P3Guess = PlayerThree.guessNum;
            System.out.println("Player Three guess the number: " + P3Guess);
            //Prints the guesses each player made

            if (P1Guess == targetNum) {
                P1Correct = true;
            }
            if (P2Guess == targetNum) {
                P2Correct = true;
            }
            if (P3Guess == targetNum) {
                P3Correct = true;
            }
            //Determines if the guess is equal to target, and changes the boolean to reflect result

            if (P1Correct || P2Correct || P3Correct) {
                System.out.println("We have a winner!");
                System.out.println("Player One correct? " + P1Correct);
                System.out.println("Player Two correct? " + P2Correct);
                System.out.println("Player Three correct? " + P3Correct);
                System.out.println("Game is over.");
                break;
                //Breaks loop if one of the players is correct with their guess
            } else {
                System.out.println("Please try again, you have all lost.");
                //Repeats loop
            }
        } 
    }
}