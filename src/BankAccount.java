class BankAccount{
    private int Account_Number;
    private String owner_Name;
    private double balance;
    BankAccount(int Account_Number,String owner_Name,double balance){
        this.Account_Number = Account_Number;
        this.owner_Name = owner_Name;
        this.balance = balance;
    }
    //getter
    public double getBalance(){
        return balance;
    }
    public  String getOwner_Name(){
        return  owner_Name;
    }
    public int getAccount_Number(){
        return  Account_Number;
    }
    //withdrawel
    public void withdrawel(double amount){
        if(amount <= 0){
            System.out.println("The balance must be in postive");
            return;
        }
        balance += amount;
        System.out.println("Deposited amount$: "+ +amount+"\n"+"New Balance $:"+balance);
    }
    //deposite
    public void deposite(double amount){
        if(amount <= 0){
            System.out.println("The amount should be in positive");
            return;
        }
        if(amount > balance){
            System.out.println("You have insufficent amount in your account");
            return;
        }
        balance -= amount;
        System.out.println("withdrawel balance $:"+amount+"\n"+"New balance $:"+balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(150855,"john",1000.0);
        System.out.println("The bank Details ur name: "+b.getOwner_Name());
        System.out.println("ur account number: "+b.getAccount_Number());
        System.out.println("The initial balance from ur account "+b.getBalance());
        b.withdrawel(500);
        System.out.println("The closing balance after your withdrawel ur amount "+b.getBalance());
        b.deposite(1000);
        System.out.println("The closing balance after your despostied ur amount "+b.getBalance());
    }
}