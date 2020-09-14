public class Player {
    int guessNum = 0;

    public void guess() {
        guessNum = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + guessNum);
    }
}