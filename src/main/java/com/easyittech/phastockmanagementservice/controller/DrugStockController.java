package com.easyittech.phastockmanagementservice.controller;

import com.easyittech.phastockmanagementservice.domain.DrugStock;
import com.easyittech.phastockmanagementservice.service.DrugStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/drug-stocks")
@CrossOrigin(origins = "http://localhost:4200")
public class DrugStockController {
    @Autowired
    private DrugStockService drugStockService;

    @PostMapping("/add")
    public ResponseEntity<DrugStock> saveDrugDealer(@RequestBody DrugStock drugStock){
        return ResponseEntity.ok().body(drugStockService.save(drugStock));
    }
    @GetMapping("/")
    public ResponseEntity<List<DrugStock>> getAllDrugDealer(){
        return ResponseEntity.ok().body(drugStockService.getAllDrugStocks());
    }
}
