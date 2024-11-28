import java.util.Scanner;
class s{
    int a=5;
    void show()
    {
        System.out.print(a);
    }

}
 class B extends s
{
    int b;
    void input()
    {
        System.out.print("Enter the number ");
        Scanner sc =new Scanner(System.in);
        b=sc.nextInt();
    }

    public static void main(String[] agr)
    {
        B obj=new B();
        obj.show();
        obj.input();
    }
}

