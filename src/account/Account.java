package account;

public abstract class Account {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.balance = balance;
        this.name = name;

    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            }
        } else {
            add(amount);
            return false;
        }
        return false;
    }
}
