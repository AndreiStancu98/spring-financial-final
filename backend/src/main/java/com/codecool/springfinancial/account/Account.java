package com.codecool.springfinancial.account;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"
    )

    private Long id;
    private String customerPid;
    private String type;
    private String currency;
    private double amount;
    private String accountNumber;
    private double interest;

    public Account() {
    }

    public Account(Long id, String customerPid, String type, String currency, double amount, String accountNumber, double interest) {
        this.id = id;
        this.customerPid = customerPid;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.interest = interest;
    }

    public Account(String customerPid, String type, String currency, double amount, String accountNumber, double interest) {
        this.customerPid = customerPid;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.interest = interest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerPid() {
        return customerPid;
    }

    public void setCustomerPid(String customer_Pid) {
        this.customerPid = customer_Pid;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer_pid=" + customerPid +
                ", type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", accountNumber='" + accountNumber + '\'' +
                ", interest=" + interest +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Double.compare(account.amount, amount) == 0 && Double.compare(account.interest, interest) == 0 && id.equals(account.id) && customerPid.equals(account.customerPid) && type.equals(account.type) && currency.equals(account.currency) && accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerPid, type, currency, amount, accountNumber, interest);
    }
}
