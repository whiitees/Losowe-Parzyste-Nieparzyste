import java.util.Random;

public class Main {
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Generated random number: " + randomNumber);
        String result = checkEvenOdd(randomNumber);
        System.out.println("The number is " + result);
    }
}
