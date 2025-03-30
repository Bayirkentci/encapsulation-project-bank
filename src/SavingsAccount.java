public class SavingsAccount extends BankAccount {
    private final double interestRate = 3.0;
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        //
    }
}
