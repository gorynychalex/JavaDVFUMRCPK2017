package ru.dvfu.mrcpk.ex12Thread;

//Класс для тестовой демонстрации системы расчета

public class Demo {
    public static void main(String[] args) {
        Account account = new Account(100_000);
        Thread withdrawThread = new Demo.WithDrawThread(account);
        Thread depositThread = new Demo.DepositThread(account);
        withdrawThread.start();
        depositThread.start();
        System.out.println("Stop balance = " + account.getBalance());
    }
    private static class WithDrawThread extends Thread {
        private final Account account;

        private WithDrawThread(Account account) {
            this.account = account;
        }

        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.withdraw(1);
            }
        }
    }

    private static class DepositThread extends Thread {
        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        }

    }
}
