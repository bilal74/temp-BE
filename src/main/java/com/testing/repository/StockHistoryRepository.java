package com.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.Entity.StockHistory;

public interface StockHistoryRepository extends JpaRepository <StockHistory, String>{
	
	List<StockHistory> findAll();
	
	List<StockHistory> saveAll();
}
