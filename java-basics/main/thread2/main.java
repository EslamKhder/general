package main.thread2;

public class main {

    public static void main(String[] args) {
        UserService userService1 = new UserService();
        userService1.start();

        UserService userService2 = new UserService();
        userService2.start();
    }


}
