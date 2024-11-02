package main.thread1;

class BankAccount {
    private int balance = 0;

    // Synchronized method to ensure thread safety synchronized
    public void deposit(int amount) throws InterruptedException {
        // t1
        // t2
        // t3
        synchronized (this) {
            try {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposited: " + amount);

            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() +  "please check this Thread");
            }
        }
// t1 t2 t3
        System.out.println("finish " + Thread.currentThread().getName());
        System.out.println("New balance: " + balance);

    }

    public int getBalance() {
        return balance;
    }
}