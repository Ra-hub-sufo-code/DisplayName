package Q78;

public class BankAccount {
    private  long accountNumber;
    private String HolderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.HolderName = holderName;
    }

    public void deposit ( double money ) {
        this.balance += money;
    }

    public double withdraw ( double money ) {
        if ( money == 0) {
            System.out.println("Invalid");
        } else if ( this.balance < money ) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= money;
        }
        return money;
    }

    public void fetchBalance ( ) {
        System.out.println("Available Balance is: "+this.balance);
    }
}
