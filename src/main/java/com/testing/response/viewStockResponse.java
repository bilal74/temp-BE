package com.testing.response;

import java.util.Date;
import java.util.List;

import com.testing.beans.StockData;

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

public class viewStockResponse 
{

private int numberOFRecords;
private List<StockData> Stock;
	
	
	
	
	
	
}
