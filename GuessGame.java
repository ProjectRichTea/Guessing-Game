public class GuessGame {
    Player P1;
    Player P2;
    Player P3;

    public void startGame() {
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean P1Correct = false;
        boolean P2Correct = false;
        boolean P3Correct = false;

        int targetNum = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true) {
            System.out.println("The correct number is " + targetNum);
        
            P1.guess();
            P2.guess();
            P3.guess();

            guessP1 = P1.guessNum;
            System.out.println("Player One guess the number: " + guessP1);

            guessP2 = P2.guessNum;
            System.out.println("Player Two guess the number: " + guessP2);

            guessP3 = P3.guessNum;
            System.out.println("Player Three guess the number: " + guessP3);

            if (guessP1 == targetNum) {
                P1Correct = true;
            }
            if (guessP2 == targetNum) {
                P2Correct = true;
            }
            if (guessP3 == targetNum) {
                P3Correct = true;
            }

            if (P1Correct || P2Correct || P3Correct) {
                System.out.println("We have a winner!");
                System.out.println("Player One correct? " + P1Correct);
                System.out.println("Player Two correct? " + P2Correct);
                System.out.println("Player Three correct? " + P3Correct);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Please try again, you have all lost.");
            }
        } 
    }
}