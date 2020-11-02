package com.easyittech.phastockmanagementservice.service.impl;

import com.easyittech.phastockmanagementservice.domain.DrugStock;
import com.easyittech.phastockmanagementservice.exception.StockCannotInsertException;
import com.easyittech.phastockmanagementservice.repository.DrugStockRepository;
import com.easyittech.phastockmanagementservice.service.DrugStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DrugStockServiceImpl implements DrugStockService {
    @Autowired
    private DrugStockRepository drugStockRepository;

    @Override
    public DrugStock save(DrugStock drugStock) {
        List<DrugStock> allByDrugId=drugStockRepository.getAllByDrugId(drugStock.getDrugId());
        if (!allByDrugId.isEmpty()) {
            throw new StockCannotInsertException("cannot insert stock for available drugs");
        }
        drugStock.setTimestamp(new Date());
        return drugStockRepository.save(drugStock);
    }

    @Override
    public List<DrugStock> getAllDrugStocks() {
        return drugStockRepository.findAll();
    }
}
