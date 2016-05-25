package ru.dvfu.mrcpk.ex12Thread;

public class Accounts {
    private long balance;
    private Accounts() { this(0L); }
    public Accounts(long balance) { this.balance = balance; }
    public long getBalance() { return  balance; }

    // 1) add synchronized to void deposit
    // 2) add synchronized(this)
    // 3) add notifyAll()
    public void deposit(long amount){
        checkAmountNonNegative(amount);
            balance += amount;

    }

    //1) add synchronized
    // 2) add synchronized(this)
    public void withdraw(long amount){
        checkAmountNonNegative(amount);
            if (balance < amount)
            {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
    }

    //2) add wait() and notifyAll()
    public synchronized void waitAndWithDraw(long amount) throws InterruptedException
    {
        checkAmountNonNegative(amount);
        while (balance < amount)
            wait();
    }

    private static void checkAmountNonNegative(long amount){
        if(amount < 0){
            throw new IllegalArgumentException("not enough money");
        }
    }
}
