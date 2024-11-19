package com.example.LedgerSystem.ENTITIES;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Service {
    @Id
    private String id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "service")
    List<Transaction> transactions;

    // Getters and Setters
}
