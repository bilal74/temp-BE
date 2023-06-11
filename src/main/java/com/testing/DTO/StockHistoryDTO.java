



package com.testing.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StockHistoryDTO {
	
	
	
	
	
	private int	stockHistoryid;
	private int billNo;
	private String stockId;
	private String supplierOrCustomerID;
	private int quantity;
	private Date date;


}
