import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountList;

    public BankCustomers() {
        accountList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountList.add(account);
    }
    public void showAllBalances(){
        for (BankAccount account : accountList) {
            System.out.println("----------------------------");
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account holder name: " + account.getAccountHolderName());
            System.out.println("Account balance: " + account.getBalance());
            System.out.println("----------------------------");
        }
    }
    public BankAccount findAccount(String accountNumber){
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        }
        System.out.println("The accounts don't exist.");
        return null;
    }
}
