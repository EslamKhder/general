package main.thread2;

public class UserService extends Thread {


    @Override
    public void run() {
        f1();
        f2();

    }

    void f1(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + "Student number " + i);
        }
    }
    void f2(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + "Student number " + i);
        }
    }
}
