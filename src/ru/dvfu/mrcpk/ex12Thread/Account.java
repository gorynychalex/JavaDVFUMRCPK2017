package ru.dvfu.mrcpk.ex12Thread;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    private Account() { this(0L); }
    public Account(long balance) { this.balance = balance; }


    public void deposit(long amount){
        checkAmountNonNegative(amount);
        balance += amount;
    }

    public void withdraw(long amount){
        checkAmountNonNegative(amount);
        if (balance < amount)
        {
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }

    private static void checkAmountNonNegative(long amount){
        if(amount < 0){
            throw new IllegalArgumentException("not enough money");
        }
    }
}
