package com.codecool.springfinancial.transaction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table
public class Transaction {

    public Transaction(Long id, String type, LocalDate date, double amount, String target, long account_id) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.target = target;
        this.account_id = account_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    @Id
    @SequenceGenerator(
            name = "transaction_sequence",
            sequenceName = "transaction_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_sequence"
    )

    private Long id;
    private String type;
    private LocalDate date;
    private double amount;
    private String target;
    private long account_id;

    public Transaction(){}

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", target='" + target + '\'' +
                ", account_id=" + account_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 && account_id == that.account_id && id.equals(that.id) && type.equals(that.type) && date.equals(that.date) && target.equals(that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, date, amount, target, account_id);
    }
}
