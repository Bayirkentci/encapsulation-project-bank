public class SavingsAccount extends BankAccount {
    private final double interestRate = 3.0;
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        this.deposit(interest);
        System.out.println(String.format("%s %.2f %s","Your account is a saving account and",
                interest, "has been added to yout account"));
    }
}
