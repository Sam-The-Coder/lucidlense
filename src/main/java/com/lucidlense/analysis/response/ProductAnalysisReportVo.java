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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getDevelopmentCost() {
		return developmentCost;
	}

	public void setDevelopmentCost(String developmentCost) {
		this.developmentCost = developmentCost;
	}

	public String getMaintenanceCosts() {
		return maintenanceCosts;
	}

	public void setMaintenanceCosts(String maintenanceCosts) {
		this.maintenanceCosts = maintenanceCosts;
	}

	public String getLicencingCost() {
		return licencingCost;
	}

	public void setLicencingCost(String licencingCost) {
		this.licencingCost = licencingCost;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public String getUiFriendliness() {
		return uiFriendliness;
	}

	public void setUiFriendliness(String uiFriendliness) {
		this.uiFriendliness = uiFriendliness;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public String getSecurityRating() {
		return securityRating;
	}

	public void setSecurityRating(String securityRating) {
		this.securityRating = securityRating;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUsability() {
		return usability;
	}

	public void setUsability(String usability) {
		this.usability = usability;
	}

	public String getInteroperability() {
		return interoperability;
	}

	public void setInteroperability(String interoperability) {
		this.interoperability = interoperability;
	}

	public String getIntegration() {
		return integration;
	}

	public void setIntegration(String integration) {
		this.integration = integration;
	}

	public String getTechnologyStack() {
		return technologyStack;
	}

	public void setTechnologyStack(String technologyStack) {
		this.technologyStack = technologyStack;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getCustomerSentimentRating() {
		return customerSentimentRating;
	}

	public void setCustomerSentimentRating(String customerSentimentRating) {
		this.customerSentimentRating = customerSentimentRating;
	}

	public String getOperationalRegion() {
		return operationalRegion;
	}

	public void setOperationalRegion(String operationalRegion) {
		this.operationalRegion = operationalRegion;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getLegalCompliance() {
		return legalCompliance;
	}

	public void setLegalCompliance(String legalCompliance) {
		this.legalCompliance = legalCompliance;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getSocialImpact() {
		return socialImpact;
	}

	public void setSocialImpact(String socialImpact) {
		this.socialImpact = socialImpact;
	}

	public String getSupportService() {
		return supportService;
	}

	public void setSupportService(String supportService) {
		this.supportService = supportService;
	}

	public String getReliability() {
		return reliability;
	}

	public void setReliability(String reliability) {
		this.reliability = reliability;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getScalability() {
		return scalability;
	}

	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

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
