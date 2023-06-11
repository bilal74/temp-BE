package com.testing.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Table(name = "Stock")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Stock implements Serializable {
	
	
@Id
private int	stockId;
private String stockCd;
private String subCategory;
private String colorFabricCd;
private int quantity;
private int measuringUnit;
//private Date date;



@OneToOne
@JoinColumn(name="stockId", referencedColumnName="stockId", insertable=true, updatable=true)
private StockHistory stockHistory;

}

