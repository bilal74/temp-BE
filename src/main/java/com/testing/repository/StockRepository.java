package com.testing.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.Entity.Stock;



public interface StockRepository extends JpaRepository <Stock, String>{
	
	
	List<Stock> saveAll();
	List<Stock> findAll();

}
