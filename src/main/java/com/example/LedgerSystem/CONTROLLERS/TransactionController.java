package com.example.LedgerSystem.CONTROLLERS;

import com.example.LedgerSystem.ENTITIES.Transaction;
import com.example.LedgerSystem.SERVICES.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/service/{serviceId}")
    public List<Transaction> getTransactionsByServiceId(@PathVariable String serviceId) {
        return transactionService.getTransactionsByServiceId(serviceId);
    }
}
