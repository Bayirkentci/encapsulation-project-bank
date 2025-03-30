public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500.0;
    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance){
        super(accountHolderName, accountNumber, initialBalance);
    }
    @Override
    public void calculateInterest(){
        //
    }

    @Override
    public void withdraw(double amount){} //kalsinmi gitsin?
 }
