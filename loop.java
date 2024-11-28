import java.util.Scanner;

public class loop
{
    public static void main(String[] agr)

{
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    a=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
        int t;
        t=a*i;
        System.out.println(+a +"*" +i + "=" +t);

    }


}
}