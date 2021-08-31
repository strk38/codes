public class BankAccount {
    private String name;
    private String address;
    private String accountid;
    private double balance;
    public void setName(String n){name=n;}
    public String getName(){return name;}

    public void setAccountId(String i){accountid=i;}
    public String getAccountId(){return accountid;}

    public void setAddress(String a){address=a;}
    public String getAddress(){return address;}

    public void setBalance(double c){balance=c;}
    public double getBalance(){return balance;}

    public void addInterest(){balance=balance+7*balance/100;}
    BankAccount(String n, String a, String i, double c)
    {
        name=n;
        address=a;
        accountid=i;
        balance=c;

    }
    public void printshob(){
        System.out.println(getName()+" "+getAddress()+" "+getAccountId()+" "+getBalance());
    }
}
