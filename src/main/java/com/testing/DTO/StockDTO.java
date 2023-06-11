package com.testing.DTO;

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
public class StockDTO {
	

	
	private String	stockId;
	private String stockCd;
	private String subCategory;
	private String colorFabricCd;
	private int quantity;
	private String measuringUnit;

}
