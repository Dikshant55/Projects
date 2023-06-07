package com.Example.ListCompare;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
@Setter
public class DataEntity {
	
	private String upcCode;
	private String vendorNum;
	private String invoiceNum;
	private String unitPrice;

}
