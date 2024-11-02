package main.spring;

public class Student extends Thread {
    public  void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
//            try {
//                Thread.sleep(100); // Sleep for 100 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }


}