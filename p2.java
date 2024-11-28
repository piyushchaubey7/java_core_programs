import java.util.Scanner;

public class p2
{
    public static void main(String[] args) {
        double number ;// Change this to the number you want to find the square root of


        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        number =sc.nextInt();
        double squareRoot = squareRoot(number);

        System.out.println("Square root of " + number + " is approximately: " + squareRoot);
    }

    public static double squareRoot(double number) {
        // Initial guess for the square root
        double guess = number / 2.0;

        // Keep improving the guess until it's close enough
        while (Math.abs(guess * guess - number) > 0.0001) {
            guess = (guess + number / guess) / 2.0;
        }

        return guess;
    }
}
