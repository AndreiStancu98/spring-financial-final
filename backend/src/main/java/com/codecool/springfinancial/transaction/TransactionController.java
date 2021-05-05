package com.codecool.springfinancial.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("api/transaction")
    public List<Transaction> getAll(){
        return transactionService.getAllTransactions();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("api/transaction/delete/id={id}")
    public void deleteTransaction(@PathVariable("id") Long id){
        transactionService.deleteTransaction(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("api/transaction/new-transaction")
    public void addNewTransaction(@RequestBody Transaction transaction){
        transactionService.addNewTransaction(transaction);
    }
}
