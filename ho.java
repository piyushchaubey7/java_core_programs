import java.util.Scanner;

class Y {
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();



    }
}
class x extends Y
{
    int a=1;
    void output1()
    {
        a=a+n;
        System.out.println("1 first class value"+ a);
    }
}


class z extends Y
{
    int b=2;
    void output2()
    {
        b=b+n;
        System.out.println("second class value "+b);

    }
}
class test
{
  public static void main(String[] agr)
  {
      x obj=new x();
      z obj1=new z();
      obj1.input();
      obj1.output2();
      obj.input();
      obj.output1();

  }
}