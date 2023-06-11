package com.testing.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;




@Table(name = "StockHistory")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class StockHistory implements Serializable {
	
	
@Id
private int	stockHistoryid;
private String billNo;
private int stockId;
private String supplierOrCustomerID;
private int quantity;
private Date date;

}