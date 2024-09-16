package E10_4;

import E10_2.BankAccount;

import java.time.LocalDate;

public class CheckingAccount extends BankAccount {
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;
    private LocalDate lastPenaltyDate;
    private boolean firstOverdraftOfMonth;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        lastPenaltyDate = LocalDate.now();
        firstOverdraftOfMonth = true;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            LocalDate today = LocalDate.now();
            if (today.getMonth() != lastPenaltyDate.getMonth() || today.getYear() != lastPenaltyDate.getYear()) {
                firstOverdraftOfMonth = true;
            }

            double penalty = firstOverdraftOfMonth ? FIRST_OVERDRAFT_PENALTY : SUBSEQUENT_OVERDRAFT_PENALTY;
            super.withdraw(amount + penalty);
            firstOverdraftOfMonth = false;
            lastPenaltyDate = today;
        } else {
            super.withdraw(amount);
        }
    }
}

