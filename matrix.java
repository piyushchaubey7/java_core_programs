import java.util.Scanner;

public class matrix {
    public static void main(String[] arg)
    {
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];
//        int i,j;
        System.out.println("Enter the first array value");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(i+"  "+j);
                b[i][j]=sc.nextInt();


            }
        }
//        for (int i = 0; i < 3; i++)
//        {`    
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.print((i + 1) + " " + (j + 1) + ": ");
//                a[i][j] = sc.nextInt();
//            }
//        }


//            System.out.println("Enter the 2 array value");
//            for(i=1;i<=3;i++)
//            {
//                for(j=1;j<=3;j++)
//                {
//                    System.out.print(i+" "+j);
//                    b[i][j]=sc.nextInt();
//
//                }
//
//            }
//            System.out.println("your Enter matrix value ");
//            for(i=1;i<=3;i++)
//            {
//                for (j = 1; j <= 3; j++) {
//                    System.out.println(a[i][j]);
//
//                }
//
//            }
//
//            for(i=1;i<=3;i++)
//            {
//                for (j = 1; j <= 3; j++) {
//                    System.out.println(b[i][j]);
//
//                }
//            }

        }





    }

