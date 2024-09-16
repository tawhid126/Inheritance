package E10_3;

import E10_2.BankAccount;

public class BasicAccount extends BankAccount {
    private static final double PENALTY = 30.0;

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            super.withdraw(amount);
            super.withdraw(PENALTY);
        } else {
            super.withdraw(amount);
        }
    }
}
