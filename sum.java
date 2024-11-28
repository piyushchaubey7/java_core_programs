import java.util.Scanner;

public class sum {
    public static void main(String[] args)
    {
        int a;
        int b;  int sum;
    Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number a ");
         a=sc.nextInt();
        System.out.print("Enter the number b");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("the sum of two number a and b is"+sum);
if(a%2==0)
{

    System.out.println("A value is the even"+a);
}
else
{
    System.out.println("A value is odd"+a);
}
if(b%2==0)
{
    System.out.println("B value is even"+b);


}
else {
    System.out.println("B value is odd"+b);
}
}
}
