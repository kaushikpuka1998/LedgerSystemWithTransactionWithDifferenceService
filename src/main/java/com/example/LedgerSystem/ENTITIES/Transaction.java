package com.example.LedgerSystem.ENTITIES;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private LocalDateTime timestamp;
    private String description;

    @ManyToOne
    @JoinColumn(name= "service_id")
    Service service;
}
