package com.model2.mvc.service.product;


import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


public interface ProductService {

	public Product findProduct(int prodNo) throws Exception;
	
	public Map<String, Object> getProductList(Search searchVO) throws Exception;
	
	public Product insertProduct(Product productVO) throws Exception;
	
	public void updateproduct(Product productVO) throws Exception;
		
}
