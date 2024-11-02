package main.thread1;

public class main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating multiple deposit threads
        DepositThread deposit1 = new DepositThread(account, 100);
        DepositThread deposit2 = new DepositThread(account, 200);
        DepositThread deposit3 = new DepositThread(account, 300);

        // Starting the threads
        deposit1.start();
        deposit2.start();
        deposit3.start();

        // Wait for all threads to finish
        /*try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance
        System.out.println("Final balance: " + account.getBalance());
*/
    }


}
