package at.htlwienwest;

public class Account {
    int amount;
    int limit;

    public Account(int amount, int limit) {
        this.amount = amount;
        this.limit = limit;
    }

    public int getAmount() {
        return amount;
    }

    public int getLimit() {
        return limit;
    }
}
