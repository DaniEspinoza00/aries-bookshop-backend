package com.example.demo.Sales.SaleRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Sales.Sale.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Integer> {
    List<Sale> findByIdUser(Integer idUser);
}
