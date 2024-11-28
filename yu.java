import java.util.Scanner;

public class yu {
    void sum(int a,int b)

    {
        int s;
        s=a+b;
        System.out.print(s);

    }
    public static void main(String[] agr)
    {
        yu obj=new yu();
        int a,b;
        System.out.print("Enter the number a and b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        obj.sum(a,b);
    }

}
