public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500.0;
    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance){
        super(accountHolderName, accountNumber, initialBalance);
    }
    @Override
    public void calculateInterest(){
        System.out.println("...");
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("The amount is invalid.");
            return;
        }
        if ((this.balance + overDraftLimit) - amount < 0) {
            System.out.println("There ain't enough money in your account.");
            return;
        }
        this.balance -= amount;
        System.out.println(String.format("%.2f has been withdrawn from your account.", amount));
    }
 }
