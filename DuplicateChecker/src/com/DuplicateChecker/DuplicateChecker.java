package com.DuplicateChecker;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChecker {
    public static void main(String[] args) {
        Map<String, Integer> combinationMap = new HashMap<>();
        
      
        addCombination(combinationMap, "vendorNum", "invoiceNum", "upcCode");
        addCombination(combinationMap, "vendornum1", "invoiceNum1", "upcCode1");
        addCombination(combinationMap, "vendoeNum", "invoiceNum", "upcCode"); 
        addCombination(combinationMap, "vendorNum2", "invoiceNum2", "upcCode2");
        addCombination(combinationMap, "vendorNum1", "invoiceNum2", "upcCode3"); 
        
        checkDuplicates(combinationMap);
    }
    
    
    private static void addCombination(Map<String, Integer> combinationMap, String vendorNum, String invoiceNum, String upcCode) {
        String key = vendorNum + "_" + invoiceNum;
        int existingValue = combinationMap.getOrDefault(key, -1);
        
        if (existingValue != -1 && existingValue != upcCode.hashCode()) {
            System.out.println("Valid Duplicate combination (" + vendorNum + ", " + invoiceNum + ") with different A values");
        } else {
            combinationMap.put(key, upcCode.hashCode());
        }
    }
    
    private static void checkDuplicates(Map<String, Integer> combinationMap) {
        for (String key : combinationMap.keySet()) {
            int count = 0;
            for (int value : combinationMap.values()) {
                if (value == combinationMap.get(key)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(" InValid  combination of upcCode with " + key);
            }
        }
    }
}

