package bank;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountBank {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    // input format
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###0,00");

    // constructor create account


    public AccountBank(int customerNumber, int pinNumber) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }

    public AccountBank(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public void getCheckingWithdrawInput() {
        boolean flag = false;
        while (!flag){
            try {
                System.out.println("Curent account balance: " + moneyFormat.format(checkingBalance));
                System.out.println("Amout you want the withdraw");
                double amount = input.nextDouble();
                if ((checkingBalance-amount)>=0 && amount>=0) {
                    // getCheckingWithdraw(amount)
                    calcCheckingWithdraw(amount);
                    System.out.println("Current balance: " + moneyFormat.format(checkingBalance));
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid choice");
                input.next();
            }
        }
    }

    public double calaCheckingDeposit(double amount) {
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    public void getCheckingDepositInput() {
        boolean flag = false;
        while (!flag){
            try {
                System.out.println("Curent account balance: " + moneyFormat.format(checkingBalance));
                System.out.println("Amout you want the withdraw");
                double amount = input.nextDouble();
                if ((checkingBalance-amount)>=0 && amount>=0) {
                    // getCheckingWithdraw(amount)
                    calcCheckingWithdraw(amount);
                    System.out.println("Current balance: " + moneyFormat.format(checkingBalance));
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid choice");
                input.next();
            }
        }
    }

    public void getTransferInput(){

    }


}
