import java.util.Scanner;
public class p3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
        input.close();
    }
    public static double findLargest(double num1, double num2, double num3)
    {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}


