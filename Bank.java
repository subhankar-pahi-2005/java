import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

class Bank
{
    public String nameOfDepositor;
    public int accNumber;
    public String accType;
    public double balanceAmount;

    public void assignValues(String nameOfDepositor, String accType, double balanceAmount)
    {
        this.nameOfDepositor=nameOfDepositor;
        this.accType=accType;
        this.balanceAmount=balanceAmount;

        Random random = new Random();
        this.accNumber=random.nextInt(1000000);
        System.out.println("Your new account number is: "+accNumber);
    }
    public void depositAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to deposit\nNote:please assign values to create an account");
        else
        {
            balanceAmount+=amount;
            System.out.println("Amount deposited successfully...");
        }
    }
    public void withdrawAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to credit\nNote:please assign values to create an account");
        else if(balanceAmount>amount)
        {
            balanceAmount-=amount;
            System.out.println("Amount credited successfully...");
        }
        else
            System.out.println("! Insufficient balance");
    }
    public void displayDetails()
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account\nNote:please assign values to create an account");
        else
        {
            System.out.println("Name of the Depositor: "+nameOfDepositor);
            System.out.println("Balance amount in the account: "+balanceAmount);
        }
    }
    public void getInput()
    {
        System.out.println("_______________________________HOW  CAN I HELP YOU_________________________________________");
        System.out.println("--------------------------PLEASE CHOOSE OPTION IN BILLOW-----------------------------" +
                "-------");
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("==>>1. Open account");
        System.out.println("**********************");
        System.out.println("==>>2. Deposit amount");
        System.out.println("**********************");
        System.out.println("==>>3. Withdraw amount");
        System.out.println("**********************");
        System.out.println("==>>4. Account details");
        System.out.println("**********************");
        System.out.println("==>>5. EXIT");
        System.out.println("                         ");
    }
}
class  Main
{
    public static void main(String[] s)  throws IOException
    {
        System.out.println("                                                   ");
        System.out.println("                                                   ");
        System.out.println("                                                   ");
        System.out.println("                                                   ");
        System.out.println("::::::::::::::::::::::::::::::WELCOME TO STATE BANK OF INDIA:::::::::::::::::::::::::::::::");
        Bank newAccount=new Bank();

        Scanner scan=new Scanner(System.in);
        boolean process=true;
        int continueState=0;

        while(continueState==0)
        {
            newAccount.getInput();
            int currentProcess=scan.nextInt();

            if(currentProcess==1)
            {
                System.out.print("Enter your name: ");
                String nameOfDepositor=scan.next();
                System.out.print("Enter your account type: ");
                String accType=scan.next();
                System.out.print("Enter your opening balance: ");
                double  balanceAmount=scan.nextDouble();
                newAccount.assignValues(nameOfDepositor, accType, balanceAmount);
            }
            else if(currentProcess==2)
            {
                System.out.print("Enter amount to deposit: ");
                newAccount.depositAmount(scan.nextDouble());
            }
            else if(currentProcess==3)
            {
                System.out.print("Enter amount to withdraw: ");
                newAccount.withdrawAmount(scan.nextDouble());
            }
            else if(currentProcess==4)
            {
                newAccount.displayDetails();
            }
            else if(currentProcess==5)
            {
                continueState=1;
                System.out.println("THANK YOU");
            }

            System.out.print ("press 0 to continue... ");
            continueState=scan.nextInt();
        }
    }
}