package com.lucidlense.analysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucidlense.analysis.repository.ProductAnalysisRepo;
import com.lucidlense.analysis.request.ProductComparisionVo;
import com.lucidlense.analysis.request.ProductRequestVo;
import com.lucidlense.analysis.response.ProductAnalysisReportVo;
import com.lucidlense.analysis.service.ProductAnalysisService;

@Service
public class ProductAnalysisServiceImpl implements ProductAnalysisService {

	@Autowired
	ProductAnalysisRepo repo;

	@Override
	public void addproduct(ProductRequestVo productRequestVo) {
		repo.addproduct(productRequestVo);

	}

	@Override
	public ProductAnalysisReportVo generateProductDeatils(ProductRequestVo productRequestVo) {
		return repo.generateProductDeatils(productRequestVo).get(0);
	}

	@Override
	public List<ProductAnalysisReportVo> productcomparision(ProductComparisionVo productComparisionVo) {
		return repo.productcomparision(productComparisionVo);
	}

}
