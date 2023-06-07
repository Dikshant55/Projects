package com.javatpoint;  
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;  
public interface IProductService  
{  
List<Product> findAll();  
}  
