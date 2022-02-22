package com.MsDeposits.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Document(collection  = "DEPOSITS")
public class Deposits {
    @Id
    private String id;
    private String NameClient;
    private String NumberCountClient;
    private Date Fecha;
    private List<Income> income;
}