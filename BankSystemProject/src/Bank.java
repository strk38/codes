import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        System.out.println("Bank Admin Menu");
        System.out.println("Please Enter a Menu Option :");
        System.out.println("1: Add Customer to the Bank");
        System.out.println("2. Change Customer Name");
        System.out.println("3. Check Account Balance");
        System.out.println("4.Modify Account Balance");
        System.out.println("5.Summary of all Accountant");
        System.out.println("-1. Quit");
        Scanner keyboard=new Scanner(System.in);
        int userInput=keyboard.nextInt();
        int size=0;
        double[] Accountbalance=new double[250];
        String[] Accountname=new String[250];

        if(userInput==1) {
            System.out.println("Add Customer Menu");
            System.out.println("Enter Account Balance");
            double balance=keyboard.nextDouble();
            Accountbalance[size]=balance;
            System.out.println("Please enter Account holder name");
            keyboard.nextLine();
            String name=keyboard.nextLine();
            Accountname[size]=name;
            System.out.println("customer id is: "+size);
            size++;
        }
        else if(userInput==2){
            System.out.println("Change name Menu");
            System.out.println("Please enter a customer Id");
            int id=keyboard.nextInt();
            System.out.println("Enter a new name");
            String nm=keyboard.next();
            Accountname[id]=nm;
            System.out.println("Changed Successfully ");
        }
        else if(userInput==3){
            System.out.println("Enter customer id");
            int id=keyboard.nextInt();
            System.out.println("Your balance is "+Accountbalance[id]);
        }
        else if(userInput==4){
            System.out.println("Enter Customer id ");
            int id=keyboard.nextInt();
            System.out.println("Modify balance");
            double balance=keyboard.nextDouble();
            Accountbalance[id]=balance;
            System.out.println("Balance Modified");
        }
        else if(userInput==5){
            double total=0;
            for(int i=0;i<250;i++){
                total=total+Accountbalance[i];
                System.out.println("Customer name "+Accountname[i]+" has "+Accountbalance[i]);
            }
            System.out.println("Overall Bank statement "+total);
        }
        else if(userInput==-1)
            System.exit(-1);
        else {
            System.out.println("Error: Invalid Input");
        }
    }
}
