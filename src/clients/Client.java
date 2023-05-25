package clients;

import account.Account;

public class Client {
    private String name;
    private Account[] accounts;

    public Client(String name, int max) {
        this.name = name;
        this.accounts = new Account[max];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            if (accounts[i].pay(amount)) {
                return true;
            }
        }
        System.out.println("Нет денег");
        return false;
    }
}
