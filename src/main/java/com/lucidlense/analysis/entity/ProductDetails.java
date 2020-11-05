package com.lucidlense.analysis.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductDetails implements Serializable {
	private static final long serialVersionUID = -1331620727108643809L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Long id;

	@Column(name = "ProductName", unique = true)
	private String productName;

	@Column(name = "ProductDescription")
	private String description;

	@Column(name = "DomainType")
	private String domainType;

	@Column(name = "RegionOfOperation")
	private String operationalRegion;

	@Column(name = "GoalsVisionMission")
	private String goals;

	@Column(name = "DevelopmentCost")
	private String developmentCost;

	@Column(name = "MaintenanceCosts")
	private String maintenanceCosts;

	@Column(name = "LicencingPolicyAndCost")
	private String licencingPolicyAndCost;

	@Column(name = "UIFriendliness")
	private String uiFriendliness;

	@Column(name = "Innovation")
	private String innovation;

	@Column(name = "Security")
	private String securityRating;

	@Column(name = "Threats")
	private String threats;

	@Column(name = "Capability")
	private String capability;

	@Column(name = "Usability")
	private String usability;

	@Column(name = "InteroperabilityDependency")
	private String interoperability;

	@Column(name = "Integration")
	private String integration;

	@Column(name = "ApplicationTechnologyPerformance")
	private String technologyStack;

	@Column(name = "Revenue")
	private String revenue;

	@Column(name = "LicenceType")
	private String licenceType;

	@Column(name = "CustomerFeedbackSentiment")
	private String customerSentimentRating;

	@Column(name = "ExistingCustomers")
	private String customers;

	@Column(name = "LegalCompliance")
	private String legalCompliance;

	@Column(name = "SecurityPrivacy")
	private String security;

	@Column(name = "SocialCulturalAdoption")
	private String socialImpact;

	@Column(name = "SupportService")
	private String supportService;

	@Column(name = "ReliabilityAvailabilityScalability")
	private String reliability;

	@Column(name = "Availability")
	private String availability;

	@Column(name = "Scalability")
	private String scalability;

	@Column(name = "LicenseSupportCosts")
	private String licencingCost;

	@Column(name = "RateOfInterest")
	private String roi;

	@Column(name = "Vision")
	private String vision;

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Feature> features;

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

	public String getOperationalRegion() {
		return operationalRegion;
	}

	public void setOperationalRegion(String operationalRegion) {
		this.operationalRegion = operationalRegion;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
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

	public String getLicencingPolicyAndCost() {
		return licencingPolicyAndCost;
	}

	public void setLicencingPolicyAndCost(String licencingPolicyAndCost) {
		this.licencingPolicyAndCost = licencingPolicyAndCost;
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

	public String getThreats() {
		return threats;
	}

	public void setThreats(String threats) {
		this.threats = threats;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
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

	public String getLicencingCost() {
		return licencingCost;
	}

	public void setLicencingCost(String licencingCost) {
		this.licencingCost = licencingCost;
	}

	public String getRoi() {
		return roi;
	}

	public String getDomainType() {
		return domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getLicenceType() {
		return licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

}
