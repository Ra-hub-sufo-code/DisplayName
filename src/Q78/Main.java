package Q78;

import Q78.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(0034,
                "Raushan kumar");
        sbi.deposit(500);
        System.out.println(sbi.withdraw(400));
        sbi.deposit(2);
        sbi.withdraw(1000);
        sbi.withdraw(0);
    }
}
