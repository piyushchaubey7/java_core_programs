import java.util.Scanner;

public class p1
{
    public static  void main(String[] args)
    {
        int number1,reverse = 0;


        System.out.println("Enter the number ");
        Scanner sc =new Scanner(System.in);
        number1=sc.nextInt();

        //we have not mentioned the initialization part of the for loop
        for( ;number1 != 0; number1=number1/10)
        {
            int remainder = number1 % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}