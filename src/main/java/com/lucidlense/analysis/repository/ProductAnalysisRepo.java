package com.lucidlense.analysis.repository;

import java.util.List;

import com.lucidlense.analysis.request.ProductComparisionVo;
import com.lucidlense.analysis.request.ProductRequestVo;
import com.lucidlense.analysis.response.ProductAnalysisReportVo;

public interface ProductAnalysisRepo {
	void addproduct(ProductRequestVo productRequestVo);

	List<ProductAnalysisReportVo> generateProductDeatils(ProductRequestVo productRequestVo);
	
	List<ProductAnalysisReportVo> productcomparision(ProductComparisionVo productsRequestVo);

}
