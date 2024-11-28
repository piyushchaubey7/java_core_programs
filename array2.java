import java.util.Scanner;

public class array2 {
public static void sum(int x,int y)
{
    int sum;
    sum=x+y;
    System.out.println("sum value is "+sum);
}


        public static void main(String[] agr)
        {
            int a,b;
            System.out.println("Enter the number a and b");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);



        }
}
