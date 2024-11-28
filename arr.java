import java.util.Scanner;

public class arr {
    public static void main(String[] args) {


        {

            int a[][] = new int[3][3];
            int b[][] = new int[3][3];
            int sum[][]= new int[3][3];
            int i,j;
            System.out.println("Enter the 3*3 number ");
            Scanner sc=new Scanner(System.in);
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    a[i][j]=sc.nextInt();

                }

            }
            System.out.println("Enter the 3*3 number for array 2 ");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                 b[i][j]=sc.nextInt();


                }

            }

            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                  sum[i][j]=a[i][j]+b[i][j];


                }

            }
            System.out.println("Sum of two array number");


            for(i=0;i<=2;i++)
            {

                for(j=0;j<=2;j++)
                {
                    System.out.print(sum[i][j]+"\s");


                }
                System.out.println("\n");
            }

        }
    }
}
