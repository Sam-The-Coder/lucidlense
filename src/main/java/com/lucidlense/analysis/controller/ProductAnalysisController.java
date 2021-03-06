package com.lucidlense.analysis.controller;

import com.lucidlense.analysis.request.ProductComparisionVo;
import com.lucidlense.analysis.request.ProductRequestVo;
import com.lucidlense.analysis.response.ProductAnalysisReportVo;
import com.lucidlense.analysis.service.ProductAnalysisService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@Api(tags = "Provides Endpoint to generate Uid's")
@RequestMapping(value = "/productanalysis")
public class ProductAnalysisController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ProductAnalysisService service;

	@CrossOrigin
	@ApiOperation(value = "Check status of uid service", notes = "This Endpoint is used to check the status of productanalysis service", nickname = "/status/check")
	@GetMapping("/status/check")
	public String status() {
		return "The service is up and running in environment -" + environment.getProperty("spring.application.name");
	}

	@CrossOrigin
	@ApiOperation(value = "Generates the productanalysis report ", notes = "This Endpoint is used to get productanalysis report", nickname = "productanalysis")
	@ApiResponses(value = { @ApiResponse(code = 503, message = "Server Error"),
			@ApiResponse(code = 500, message = "Server Error"), @ApiResponse(code = 400, message = "Service Not Found"),
			@ApiResponse(code = 202, message = "UID Generated"), @ApiResponse(code = 200, message = "UID Generated") })
	@PostMapping(value = "/getproductAnalysis", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ProductAnalysisReportVo> generateProductDeatils(
			@RequestBody ProductRequestVo productRequestVo) {
		// log.info("The service to generate the productanalysis report-" +
		// productRequestVo.toString());
		return new ResponseEntity<ProductAnalysisReportVo>(service.generateProductDeatils(productRequestVo), HttpStatus.OK);

	}

	@CrossOrigin
	@ApiOperation(value = "Generates the productcomparision report ", notes = "This Endpoint is used to get productcomparision report", nickname = "productcomparision")
	@ApiResponses(value = { @ApiResponse(code = 503, message = "Server Error"),
			@ApiResponse(code = 500, message = "Server Error"), @ApiResponse(code = 400, message = "Service Not Found"),
			@ApiResponse(code = 202, message = "UID Generated"), @ApiResponse(code = 200, message = "UID Generated") })
	@PostMapping(value = "/productcomparision", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<ProductAnalysisReportVo>> productcomparision(
			@RequestBody ProductComparisionVo productsRequestVo) {
		// log.info("The service to generate the productanalysis report-" +
		return new ResponseEntity<List<ProductAnalysisReportVo>>(service.productcomparision(productsRequestVo), HttpStatus.OK);

	}

	@CrossOrigin
	@ApiOperation(value = "Generates the productcomparision report ", notes = "This Endpoint is used to get productcomparision report", nickname = "productcomparision")
	@ApiResponses(value = { @ApiResponse(code = 503, message = "Server Error"),
			@ApiResponse(code = 500, message = "Server Error"), @ApiResponse(code = 400, message = "Service Not Found"),
			@ApiResponse(code = 202, message = "UID Generated"), @ApiResponse(code = 200, message = "UID Generated") })
	@PostMapping(value = "/addproductinfo", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public void addproduct(@RequestBody ProductRequestVo productRequestVo) {
		service.addproduct(productRequestVo);

	}
}
