package com.MsDeposits.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.Date;

@Data
@AllArgsConstructor
public class Income {
    private String NameDeposit;
    private Double Deposit;
    private Date Date;
}
