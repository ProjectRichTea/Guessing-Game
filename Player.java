public class Player {
    int guessNum = 0;
    //Initialises the guess number for each player

    public void guess() {
        guessNum = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + guessNum);
        //Picks a random number between 0 and 9 to use as the player's guess
    }
}