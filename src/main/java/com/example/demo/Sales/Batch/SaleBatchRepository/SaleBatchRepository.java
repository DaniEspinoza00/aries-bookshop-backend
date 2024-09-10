package com.example.demo.Sales.Batch.SaleBatchRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Sales.Batch.SaleBatch.SaleBatch;



@Repository
public interface SaleBatchRepository extends JpaRepository<SaleBatch, Integer>{
    
}