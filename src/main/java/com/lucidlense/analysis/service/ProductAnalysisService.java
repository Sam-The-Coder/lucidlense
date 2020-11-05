package com.lucidlense.analysis.service;

import java.util.List;

import com.lucidlense.analysis.request.ProductComparisionVo;
import com.lucidlense.analysis.request.ProductRequestVo;
import com.lucidlense.analysis.response.ProductAnalysisReportVo;

public interface ProductAnalysisService {
	void addproduct(ProductRequestVo productRequestVo);

	ProductAnalysisReportVo generateProductDeatils(ProductRequestVo productRequestVo);

	List<ProductAnalysisReportVo> productcomparision(ProductComparisionVo productsRequestVo);
}
