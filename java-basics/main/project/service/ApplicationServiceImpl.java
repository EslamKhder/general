package main.project.service;

import main.project.model.Account;

import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Sir");

        System.out.println("Please Enter your choose");
        System.out.println("a.login     b.signup   c.exit");
        char choose = scanner.next().charAt(0);
        switch (choose) {
            case 'a':
                login();
                break;
            case 'b':
                signup();
                break;
            case 'c':
                System.out.println("you are welcome.");
                break;
            default:
                System.out.println("Invalid Choose");
        }
    }

    private void signup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();

        ValidationService validationService = new ValidationServiceImpl();

        // TODO Validation on UserName and Password
        if (!validationService.validateUserName(name)) {
            System.out.println("Invalid UserName");
        }

        if (!validationService.validatePassword(password)) {
            System.out.println("Invalid Password");
        }

        // TODO SERVICE OF ACCOUNT TO CREATE ACCOUNT

        AccountService accountService = new AccountServiceImpl();
        if (accountService.createAccount(new Account(name, password))) {
            System.out.println("Account Created");
        } else {
            System.out.println("Account not Created Because " + "");
        }

    }

    private void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();

        ValidationService validationService = new ValidationServiceImpl();

        // TODO Validation on UserName and Password
        if (!validationService.validateUserName(name)) {
            System.out.println("Invalid UserName");
        }

        if (!validationService.validatePassword(password)) {
            System.out.println("Invalid Password");
        }


        // TODO SERVICE OF ACCOUNT TO CREATE LOGIN
        AccountService accountService = new AccountServiceImpl();
        if (accountService.loginAccount(new Account(name, password))) {
            System.out.println("Login  Success");
            services();
        } else {
            System.out.println("Account not Exist");
        }

    }

    private void services() {

        System.out.println("1.Deposit   2.Withdraw    3.show details    4.Transfer    5. show balance");
    }

    void deposit(Account a, int money){
        //a.addB(money);

    }
}
