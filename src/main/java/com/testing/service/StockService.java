package com.testing.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.DTO.StockDTO;
import com.testing.DTO.StockHistoryDTO;
import com.testing.Entity.Stock;
import com.testing.Entity.StockHistory;
import com.testing.beans.StockData;
import com.testing.repository.StockHistoryRepository;
import com.testing.repository.StockRepository;
import com.testing.request.StockRequest;
import com.testing.response.viewStockResponse;



@Service
public class StockService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	StockRepository stockRepo;
	
	
	@Autowired  
	StockHistoryRepository  stockHistoryRepo;
	


	StockDTO stockdto =new StockDTO();
	StockHistoryDTO stockHistorydto =new StockHistoryDTO();
	
	
	public void addStock(StockRequest data)
	{
		String uuid=UUID.randomUUID().toString(); 
		List<Stock> stlist=null;
		List<StockHistory> stHistorylist=null;
		setStockData(uuid,data);
		setStockHistoryData(uuid,data);
		Stock st= mapper.map(stockdto, Stock.class);
		StockHistory stockHistory=mapper.map(stockHistorydto, StockHistory.class);
		stHistorylist.add(stockHistory);
		stlist.add(st);
		stockRepo.saveAll(stlist);
		stockHistoryRepo.saveAll(stHistorylist);
		
	}

	
	
	public List<StockData> viewStock()
	{
		List<StockData> viewStockresponse = new ArrayList<>();
		List<StockDTO> stockdtolist = new ArrayList<>();
		List<StockHistoryDTO> stockHistorydtolist = new ArrayList<>();

		List<Stock> stocks = stockRepo.findAll();
		List<StockHistory> sHistory = stockHistoryRepo.findAll();
		for (Stock st : stocks) {
			stockdto = mapper.map(st, StockDTO.class);
			stockdtolist.add(stockdto);
		}

		for (StockHistory st : sHistory) {
			stockHistorydto = mapper.map(st, StockHistoryDTO.class);
			stockHistorydtolist.add(stockHistorydto);
		}
		stockdtolist.stream().forEach(x -> stockdtolist.stream().forEach(y -> {
			if (y.getStockId().equalsIgnoreCase(x.getStockId())) {
				StockData st = new StockData();
				st.setBillNo(0);
				st.setCloth(null);
				st.setColorFabricCd(null);
				st.setDate(null);
				st.setMaterial(null);
				st.setPackingSlipNumber(0);
				st.setQuantity(0);
				st.setSubCategory(null);
				st.setSuplierName(null);
				viewStockresponse.add(st);

			}
		}));

		return viewStockresponse;

	}
	
	
	
	public List<StockHistoryDTO> viewStockHistory()
	{
		List<StockHistoryDTO> stockHistorydtolist = new ArrayList<>();
		List<StockHistory> sHistory = stockHistoryRepo.findAll();
		for (StockHistory st : sHistory) {
			stockHistorydto = mapper.map(st, StockHistoryDTO.class);
			stockHistorydtolist.add(stockHistorydto);
		}
		return stockHistorydtolist;
	}
	
	
	
	
	


	private void setStockData(String Uid, StockRequest data) {
	
		stockdto.setColorFabricCd(data.getColorFabricCd());
		stockdto.setMeasuringUnit(data.getMeasuringUnit());
		stockdto.setStockCd(data.getCloth());
		stockdto.setStockId(Uid);
		stockdto.setSubCategory(data.getSubCategory());
	}
	
	
	private void setStockHistoryData(String Uid, StockRequest data) {
		
		stockHistorydto.setBillNo(data.getBillNo());
		stockHistorydto.setDate(data.getDate());
		stockHistorydto.setQuantity(data.getQuantity());
		stockHistorydto.setSupplierOrCustomerID(data.getSuplierName());
		stockHistorydto.setStockId(Uid);
		

	}

}
