package com.testing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testing.DTO.StockHistoryDTO;
import com.testing.beans.StockData;
import com.testing.request.StockRequest;
import com.testing.response.viewStockHistoryResponse;
import com.testing.response.viewStockResponse;
import com.testing.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService stockservice;

	@PostMapping("/addStock")
	public ResponseEntity<Object> addStock(@RequestBody StockRequest stock) {

		stockservice.addStock(stock);

		return ResponseEntity.ok(HttpStatus.OK);
       }
	
	
	@GetMapping("/viewStock")
	public viewStockResponse viewStock() {
		viewStockResponse response=new viewStockResponse();
		List<StockData> viewStockresponselist=stockservice.viewStock();
		response.setNumberOFRecords(viewStockresponselist.size());
		response.setStock(viewStockresponselist);

		return response;
       }
	
	
	@GetMapping("/viewStockHistory")
	public viewStockHistoryResponse viewStockHistory() {
		viewStockHistoryResponse response= new viewStockHistoryResponse();
		List<StockHistoryDTO> viewStockresponselist=stockservice.viewStockHistory();
		response.setSize(viewStockresponselist.size());
		response.setViewStockresponselist(viewStockresponselist);
		return response;
       }

}
