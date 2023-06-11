package com.testing.beans;

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
public class StockData 
{
	private int StockId;
	private String cloth;
	private String subCategory;
	private int quantity;
	private int billNo;
	private Date date;
	private int packingSlipNumber;
	private String suplierName;
	private String material;
	private String colorFabricCd;
	
}
