package com.easyittech.phastockmanagementservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pha_drug_stock")
@Getter@Setter
public class DrugStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private Long id;
    @Column(name = "stock_count")
    private Long stockCount;
    private String status;
    @Column(name = "inserted_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Column(name = "drug_id")
    private Long drugId;

}
