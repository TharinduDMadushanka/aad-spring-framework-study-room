package com.edu.tdm.service;

public class PaymentService {

    public void processPayment(String accountNumber, double amount) {
        System.out.println("Processing payment for account: " + accountNumber + " of amount: $" + amount);
    }

    public void cancelPayment(String accountNumber) {
        System.out.println("Cancelling payment for account: " + accountNumber);
    }

}
