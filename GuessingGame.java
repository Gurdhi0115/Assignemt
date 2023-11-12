public class GuessingGame {
    public static void main(String[] args) {
        int low = 1;
        int high = 1000;
        Guesser guesser = new Guesser(low, high);
        guesser.start();
    }
}

