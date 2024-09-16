package E10_2;

public class BasicAccount extends BankAccount {

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

