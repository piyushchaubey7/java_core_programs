import java.util.Scanner;

public class array
{
    public static void main(String[] agr)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value ");
        a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int t;
            t=i*a;
            System.out.println(a+"*"+i+"="+t);

        }

    }
}
