import account.Account;
import account.CheckingAccount;
import account.CreditAccount;
import account.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Никита", 3);// созд объект
        client.add(new SavingsAccount("Saving", 0, 1000));// доб клиента
        client.add(new CreditAccount("Credit", 0));// доб клиента
        client.add(new CheckingAccount("Checking", 0));// доб клиента

        System.out.println(client.pay(11000));// делаем оплату
        System.out.println(client.pay(5000));
        System.out.println(client.pay(6000));
        client.add(new SavingsAccount("xyi", 2000, 1000));
    }
}