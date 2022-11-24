package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class atm{
    int accno;
    float amount=0;
    int pin;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> th=new ArrayList<>();

    void deposit_funds( )
    {
        float am;
        System.out.println("Enter amount you want to deposit ");
        am=sc.nextFloat();
        amount=amount+am;
        System.out.println(am+" Deposited in the account successfully ");
       th.add(am+ " deposited ");

    }
    void withdraw(){
        float wam;
        System.out.println("Enter amount you want to withdraw ");
        wam=sc.nextFloat();
        if(wam>amount)
        {
            System.out.println("Sorry you have entered more amount than your account balance ");
        }
        else{
            amount=amount-wam;
            System.out.println("\nProcessing...");
            System.out.println("\nPlease collect your cash ");
            System.out.println(wam+" withdrawed from your account ");
            System.out.println("\nCurrent account balance : "+amount);
            th.add(wam+" Withdrawn ");

        }

    }
    void transfer(){
        float am;
        int accno1;
        System.out.println("Enter account number whom you want to transfer the money ");
        accno1=sc.nextInt();
        System.out.println("Enter amount which you want to transfer ");
        am=sc.nextFloat();
        if(am>amount)
        {
            System.out.println("You have entered more amount than your account balance ");

        }
        else{
            amount=amount-am;
            System.out.println(am+" transferred successfully ");
            System.out.println("Your current account balance is : "+ amount );
            th.add(am+" transferred to account  no "+ accno1);


        }

    }

   void transactionhistory(){
        for(int i=0;i<th.size();i++)
        {
            System.out.print((i+1)+ " : ");
            System.out.println(th.get(i));
        }
   }

}
public class task3 {
    public static void main(String[] args) {
        atm a = new atm();
        a.accno = 12345678;
        a.pin = 1234;
        float useraccno;
        int userpin;

        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter account number ");
        useraccno = sc.nextFloat();
        System.out.println("Enter Pin ");
        userpin = sc.nextInt();
        if ((a.accno == useraccno) && (a.pin == userpin)) {
            do {
                System.out.println("\nEnter 1 for deposit cash into the account ");
                System.out.println("\nEnter 2 for withdrawing cash ");
                System.out.println("Enter 3 for tranfering money ");
                System.out.println("Enter 4 for transaction history ");
                System.out.println("Enter 5 for exit ");
                System.out.println("\nEnter Your choice :  ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        a.deposit();
                        break;
                    case 2:
                        a.withdraw();
                        break;
                    case 3:
                        a.transfer();
                        break;
                    case 4:
                        a.transactionhistory();
                          break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input ");
                }
            } while (ch != 5);

        }

    else {
            System.out.println("Invalid credentials");
        }
    }
}
