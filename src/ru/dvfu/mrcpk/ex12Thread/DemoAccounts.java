package ru.dvfu.mrcpk.ex12Thread;

public class DemoAccounts {
    public static void main(String[] args) throws InterruptedException
    {
        Accounts accounts = new Accounts(100_000);
        System.out.println("Start balance = " + accounts.getBalance());

        Thread withdrawThread = new WithDrawThread(accounts);
        Thread depositThread = new DepositThread(accounts);
        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

        System.out.println("Stop balance = " + accounts.getBalance());
    }

    private static class WithDrawThread extends Thread{
        private final Accounts accounts;

        private WithDrawThread(Accounts accounts)
        {
            this.accounts = accounts;
        }

        public void run(){
            for (int i = 0; i < 20_000; i++)
            {
                accounts.withdraw(1);
            }
        }
    }

    private static class DepositThread extends Thread{
        private final Accounts accounts;

        private DepositThread(Accounts accounts){
            this.accounts = accounts;
        }

        public void run(){
            for (int i = 0; i < 20_000; i++)
            {
                accounts.deposit(1);
            }
        }

    }
}
