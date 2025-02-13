package com.project_management.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String contractName;

    private Date signedDateDate;

    private BigDecimal amount;

    private int status;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
