public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (Character.isUpperCase(accountHolderName.charAt(0)))
            this.accountHolderName = accountHolderName;
        else {
            this.accountHolderName = Character.toUpperCase(accountHolderName.charAt(0))
                    + accountHolderName.substring(1);
        }
    }
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            balance = 0;
    }

    public abstract void calculateInterest();
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("The amount is invalid.");
            return;
        }
        this.balance += amount;
        System.out.println(String.format("%.2f has been added to your account.", amount));
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("The amount is invalid.");
            return;
        }
        if (this.balance - amount < 0) {
            System.out.println("There ain't enough money in your account.");
            return;
        }
        this.balance -= amount;
        System.out.println(String.format("%.2f has been withdrawn from your account.", amount));
    }
}
