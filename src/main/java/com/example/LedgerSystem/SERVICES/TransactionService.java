package com.example.LedgerSystem.SERVICES;

import com.example.LedgerSystem.ENTITIES.Transaction;
import com.example.LedgerSystem.REPOSITORIES.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction transaction) {
        transaction.setTimestamp(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public List<Transaction> getTransactionsByServiceId(String serviceId) {
        return transactionRepository.findByServiceId(serviceId);
    }

}
