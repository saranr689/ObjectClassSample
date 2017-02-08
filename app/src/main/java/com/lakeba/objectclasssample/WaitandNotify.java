package com.lakeba.objectclasssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lakeba01 on 8/2/17.
 */

public class WaitandNotify extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();


        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }

    private class Customer {
        int amount = 10000;

        //
        synchronized void withdraw(int amount) {
            System.out.println("going to withdraw...");

            if (this.amount < amount) {
                System.out.println("Less balance; waiting for deposit...");
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            this.amount -= amount;
            System.out.println("withdraw completed...");
        }

        synchronized void deposit(int amount) {
            System.out.println("going to deposit...");
            this.amount += amount;
            System.out.println("deposit completed... ");
            notify();
        }
    }
}

