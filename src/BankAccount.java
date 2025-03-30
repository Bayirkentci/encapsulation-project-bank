public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountNumber1) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    //Setters
    public void setAccountNumber(String accountNumber) {
        
    }
    public void setAccountHolderName(String accountHolderName) {
        //
    }
    public void setBalance(double balance) {
        //
    }

    //Methods
    public abstract void calculateInterest();
    public void deposit(double amount){
        //
    }
    public void withdraw(double amount){
        //
    }


}
