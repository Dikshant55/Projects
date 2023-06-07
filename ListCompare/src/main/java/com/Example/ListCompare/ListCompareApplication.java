package com.Example.ListCompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListCompareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListCompareApplication.class, args);
		 
		//DataEntity d4 = DataEntity.builder().upcCode("100").vendorNum("1").build();
		//d4.setInvoiceNum("1");d4.setUnitPrice("1");
		DataEntity d1 = DataEntity.builder().upcCode("100").vendorNum("1").invoiceNum("5").unitPrice("2").build();
		DataEntity d2 = DataEntity.builder().upcCode("100").vendorNum("1").invoiceNum("5").unitPrice("12").build();
		//DataEntity d3 = DataEntity.builder().upcCode("101").vendorNum("1").invoiceNum("1").unitPrice("1").build();

		List<DataEntity> dataList = Arrays.asList(d1, d2);
 
		Map<String, List<String>> combinations = new HashMap<>();
		for (DataEntity data : dataList) {
			System.out.println(data);

			String combination = data.getVendorNum() + " " + data.getInvoiceNum() + " " + data.getUpcCode();
			String combination1= data.getUpcCode()+data.getUnitPrice();
			String unitPrice = data.getUnitPrice();
			
			List<String> values = combinations.getOrDefault(combination, new ArrayList<>());
			List<String> val = combinations.getOrDefault(combination1, new ArrayList<>());
			List<String> val1=new ArrayList<String>();
			val1.addAll(values);
			val1.addAll(val);
			
			if (val1.contains(unitPrice)) {
				
				System.out.println("ok");
				
			} else {
				
				values.add(unitPrice);
				combinations.put(combination, values);
			

			}
		}

	}

}
