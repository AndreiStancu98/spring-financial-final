package com.codecool.springfinancial.payload.request;

import javax.validation.constraints.NotNull;

public class AccountRequest {
    @NotNull
    private String customerPid;
    @NotNull
    private String type;
    @NotNull
    private String currency;
    @NotNull
    private Double amount;
    @NotNull
    private String accountNumber;
    @NotNull
    private Double interest;

    public String getCustomerPid() {
        return customerPid;
    }

    public void setCustomerPid(String customerPid) {
        this.customerPid = customerPid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
