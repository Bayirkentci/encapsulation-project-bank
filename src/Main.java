import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BankCustomers customer = new BankCustomers();

        BankAccount ataman = new SavingsAccount("5567","ataman",2000);
        BankAccount dayan = new SavingsAccount("6473","dayan",2000);
        BankAccount yashar = new SavingsAccount("7345","yashar",2000);

        BankAccount durulash = new TransactionAccount("3121","durulash",2000);
        BankAccount tacli = new TransactionAccount("3724","tacli",2000);
        BankAccount ulash = new TransactionAccount("3212","ulash",2000);

        ArrayList<BankAccount> accounts = new ArrayList<>(Arrays.asList(ataman, dayan, yashar, durulash, tacli, ulash));

        for (BankAccount account : accounts) {
            customer.addAccount(account);
        }

        BankAccount test1 = customer.findAccount("1112");
        BankAccount test2 = customer.findAccount("3221");

        System.out.println(test1.getAccountHolderName() + "balance is :" + test1.getBalance());
        test1.deposit(60);
        System.out.println(test1.getAccountHolderName() + "balance is :" + test1.getBalance());

        ataman.deposit(-10000);
        System.out.println(ataman.getAccountHolderName() + "balance is :" + ataman.getBalance());

        yashar.calculateInterest();
        durulash.calculateInterest();
        System.out.println(yashar.getAccountHolderName() + "balance is :" + yashar.getBalance());
        System.out.println(durulash.getAccountHolderName() + "balance is :" + durulash.getBalance());

        ulash.withdraw(12);
        ulash.withdraw(-300);
        ulash.withdraw(550000000);

        dayan.withdraw(12);
        dayan.withdraw(-300);
        dayan.withdraw(550000000);

        customer.showAllBalances();
    }
}