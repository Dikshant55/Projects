package com.Practice.Method;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		String a=null;
		System.out.println(!isEmpty(a));
		
		
		
		System.out.println("enter number");
		int num =sc.nextInt();
		if(isNumberOrGreaterThan0(num)) {
		System.out.println("good");}
		else System.out.println("error");
		
		
		Integer discountDayDue = getDiscountDayDue(new ObjectEntity());
		
		System.out.println(discountDayDue);
		}
	
		
	public static boolean isNumberOrGreaterThan0(Integer value) {
		
		if (value !=0 && value !=null) {
			return true;
		}
		return false;}
	
	public static boolean isNotNullAndgreaterThan0(Integer value) {
		if (value !=null && value > 0) {
			return true;
		}
		return false;}
	
	public static Integer getDiscountDayDue(ObjectEntity entity) {
		Integer discountDayDue =null;
		
		if (isNotNullAndgreaterThan0(entity.getNetDays())) {
			
			discountDayDue =entity.getNetDays();
		}else if(entity.getBasicDate() !=null && entity.getNetDueDate() != null) {
			
			long diff= ChronoUnit.DAYS.between(entity.getBasicDate(),entity.getNetDueDate());
		
			discountDayDue = Math.floorMod(diff, 30);
		}
		
		return discountDayDue;}

	public static Double doubleValue(String value) {
		try {
			return Double.parseDouble(value);
			
		}
		catch (Exception e) {
			
		}
		return null;
	}
	
	public static boolean isEmpty(String value) {
		
		if(value == null) {
			return true;
		}
		return false;
	}
	
	
}

