package com.easyittech.phastockmanagementservice.repository;

import com.easyittech.phastockmanagementservice.domain.DrugStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface DrugStockRepository extends JpaRepository<DrugStock,Long> {
    List<DrugStock> getAllByDrugId(long drugId);
}
