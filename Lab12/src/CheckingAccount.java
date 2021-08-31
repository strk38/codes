public class CheckingAccount extends Account {
    public double b;
    public double c;
    public CheckingAccount(String name,double balanc){
        super(name);
       b=balanc;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("=================");
        System.out.println("Name : "+getName());
        System.out.println("AccountNumber : "+getAccountNumber());
        setBalance(b);
        System.out.println("Balance : "+getBalance());
        if(b<500){
            System.out.println("Your balance is less than minimum amount");
        }
        else{}
        System.out.println("=================");
    }
    public String deposit(double d){
        if(d<=0){
            System.out.println("Please enter amount greater than zero.");
        }
        else{ b=b+d;
            System.out.println("Deposit Successful");
        }
        return "";
    }
    public String withdraw(double w){
        if(w>b){
            System.out.println("You dont have enough fund .");
        }
        else if(w<=0){
            System.out.println("Please enter amount greater than zero");
        }
        else{
            b=b-w;
            System.out.println("Withdraw Successful .");
        }
    return "";
    }
}
