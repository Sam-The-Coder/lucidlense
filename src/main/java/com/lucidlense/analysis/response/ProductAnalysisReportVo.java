package com.lucidlense.analysis.response;

import com.lucidlense.analysis.request.Feature;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Component
@Getter
@Setter
@XmlRootElement
public class ProductAnalysisReportVo {
	private String productName;
	private String description;
	private String vision;
	private String developmentCost;
	private String maintenanceCosts;
	private String licencingCost;
	private List<Feature> features;
	private String uiFriendliness;
	private String innovation;
	private String securityRating;
	private String domain;
	private String usability;
	private String interoperability;
	private String integration;
	private String technologyStack;
	private String revenue;
	private String customerSentimentRating;
	private String operationalRegion;
	private String customers;
	private String legalCompliance;
	private String security;
	private String socialImpact;
	private String supportService;
	private String reliability;
	private String availability;
	private String scalability;
	private String licenseType;

}
