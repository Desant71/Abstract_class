package account;

import account.Account;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance = +amount;
        return false;
    }
}
