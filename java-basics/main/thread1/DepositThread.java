package main.thread1;

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            account.deposit(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}