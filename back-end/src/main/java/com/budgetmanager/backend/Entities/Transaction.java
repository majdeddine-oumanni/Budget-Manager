package com.budgetmanager.backend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Transaction {
    @Id
    private Long id;
    private double amount;
    private Date date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
