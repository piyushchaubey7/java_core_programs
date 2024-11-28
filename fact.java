import java.util.Scanner;

public class fact {
    public static void main(String[] agrs)
    {
        int a,i,fact=1;
        System.out.println("Enter the number for find factorial value ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial value"+fact);
    }
}
