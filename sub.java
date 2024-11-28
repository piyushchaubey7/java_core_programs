import java.util.Scanner;

public class sub
{
    int a,b;
    sub() {
        Scanner sc = new Scanner(System.in);
        Scanner sx= new Scanner(System.in);

        System.out.println("Enter the number a and b");
        a = sc.nextInt();
        b = sx.nextInt();
    }
    void sum()
    {
        int s;
        s=a+b;
        System.out.println("The sum value is "+s);

    }
    void sub()
    {
        int s;
        s=a-b;
        System.out.println("the sub value is "+s);

    }
    void div()
    {
        float d;
        d=a/b;
        System.out.println("The div value is"+d);


    }
    void mul()
    {
        int m;
        m=a*b;

        System.out.println("the mul value "+m);
    }

}
class cal {


    public static void main(String[] agr)
    {
        System.out.println("Enter the  value");

        sub d=new sub();
        d.div();
        d.mul();
        d.sub();
        d.sum();




    }
}
