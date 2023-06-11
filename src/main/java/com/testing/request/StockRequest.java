package com.testing.request;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


	
	
	
	

@ToString
@Setter
@Getter
@Builder(toBuilder=true)
@AllArgsConstructor
@NoArgsConstructor
public class StockRequest {
		
		
		private int uniqueId;
		private int billNo;
		private Date date;
		private int packingSlipNumber;
		private String suplierName;
		private String material;
		private String colorFabricCd;
		private String cloth;
		private String subCategory;
		private String measuringUnit;
		private int quantity;
		private int amount;
		//private boolean isCloth=true;
		
		
		
		

}
