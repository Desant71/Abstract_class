import account.Account;
import account.CheckingAccount;
import account.CreditAccount;
import account.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount("1", 20000);
        Account account2 = new CreditAccount("2", 20000);
        Account account3 = new SavingsAccount("3", 20000, 0);
        System.out.println(account1.transfer(account3, 5000));
        System.out.println(account2.transfer(account1,5000));
        System.out.println(account3.transfer(account1, 5000));
    }
}