package com.easyittech.phastockmanagementservice.service;

import com.easyittech.phastockmanagementservice.domain.DrugStock;

import java.util.List;

public interface DrugStockService {
    DrugStock save(DrugStock drugStock);

    List<DrugStock> getAllDrugStocks();
}
