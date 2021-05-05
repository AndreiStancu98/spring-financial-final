package com.codecool.springfinancial.payload.request;

import javax.validation.constraints.NotNull;

public class TransactionRequest {
    @NotNull
    private String accountNumber;
    @NotNull
    private String targetAccount;
    @NotNull
    private double funds;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }
}
