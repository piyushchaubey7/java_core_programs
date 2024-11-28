import java.util.Scanner;

import static java.lang.System.exit;

class SBI
{
    String name;
    int accno;
    String type;
    int amount;
    int amount1;

    int total;


    SBI()
    {
        name="UNKNOWN";
        total=0;
        amount=0;
        accno=0;
        type="SAVING";


    }
    void setvalue()
    {

        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);

        System.out.println("Enter the name:");
        name= sc.nextLine();

        System.out.println("Enter the Account number");
        accno= sc.nextInt();
        System.out.println("Enter the account type");
        type=ss.nextLine();
        System.out.println("Enter the Balance");
        amount=sc.nextInt();
        total=total+amount;





    }


    void showbal()
    {
        System.out.println("Name:  "+name);
        System.out.println("Account No"+accno);
        System.out.println("Account type:  "+type);
        System.out.println("Total balance is"+total);


    }
    void deposit()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter amount to be deposited");
        amount1=sc.nextInt();
        total=total+amount1;

    }
    void withdrawl()
    {
        if(total==0)
        {
            System.out.println("No available balance");

        }
        else {
            int withdrawAmount;

            Scanner sc=new Scanner(System.in);


            System.out.println("Enter the amount to withdraw");
            withdrawAmount=sc.nextInt();
            total=total-withdrawAmount;
            System.out.println("Available balance is:"+total);



        }
    }

}
class RBI       //main class  
{
    public static void main(String[] agr) {
        SBI d = new SBI(); //object


        int choice;
        char ch = 0;
        System.out.println("                           ||  WELCOME TO MY PROJECT  ||                              ");
        System.out.println("======================================================================================");

        do {
            int check;
            System.out.println("                              WELCOME TO ATM                   ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("       Enter the four digits pin     ");


            Scanner sc = new Scanner(System.in);
            check = sc.nextInt();

            if (check == 1111) {
                System.out.println("                         CHOICE ANY ONE OPTION         ");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("1 : Enter the data ");
                System.out.println("    2 : BALANCE ENQUIRY");
                System.out.print("3 : DEPOSIT MENEY ");
                System.out.println("    4 : WITHDRAW MONEY ");
                System.out.println("5 : CHANCEL AND EXIT ");
                System.out.println("__________________________________________________________________________________________");
                System.out.println("...........................................................................................");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        d.setvalue();
                        break;
                    case 2:
                        d.showbal();
                        break;
                    case 3:
                        d.deposit();
                        break;
                    case 4:
                        d.withdrawl();
                    case 5:
                        exit(1);
                        break;
                    default: {
                        System.out.println("Wrong choice:");

                    }


                }

                Scanner cc = new Scanner(System.in);
                System.out.println("Do you wish to continue (y/n)");
                ch = cc.next().charAt(0);



            }
            else
            {
                System.out.println("Wrong pin");


            }

        }
        while (ch=='y'||ch=='n');
    }






}