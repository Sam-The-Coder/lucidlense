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

	@Column(name = "ProductName", nullable = false, unique = true)
	private String productName;
	
	@Column(name = "ProductDescription", nullable = false)
	private String description;

	@Column(name = "RegionOfOperation", nullable = false)
	private String operationalRegion;

	@Column(name = "GoalsVisionMission", nullable = false)
	private String goals;

	@Column(name = "DevelopmentCost", nullable = false)
	private double developmentCost;

	@Column(name = "MaintenanceCosts", nullable = false)
	private double maintenanceCosts;

	@Column(name = "LicencingPolicyAndCost", nullable = false)
	private String licencingPolicyAndCost;

	@Column(name = "UIFriendliness", nullable = false)
	private String uiFriendliness;

	@Column(name = "Innovation", nullable = false)
	private String innovation;

	@Column(name = "Security", nullable = false)
	private String securityRating;

	@Column(name = "Threats", nullable = false)
	private String threats;

	@Column(name = "Capability", nullable = false)
	private String capability;

	@Column(name = "Usability", nullable = false)
	private String usability;

	@Column(name = "InteroperabilityDependency", nullable = false)
	private String interoperability;

	@Column(name = "Integration", nullable = false)
	private String integration;

	@Column(name = "ApplicationTechnologyPerformance", nullable = false)
	private String technologyStack;

	@Column(name = "Revenue", nullable = false)
	private double revenue;

	@Column(name = "CustomerFeedbackSentiment", nullable = false)
	private String customerSentimentRating;

	@Column(name = "ExistingCustomers", nullable = false)
	private String customers;

	@Column(name = "LegalCompliance", nullable = false)
	private String legalCompliance;

	@Column(name = "SecurityPrivacy", nullable = false)
	private String security;

	@Column(name = "SocialCulturalAdoption", nullable = false)
	private String socialImpact;

	@Column(name = "SupportService", nullable = false)
	private String supportService;

	@Column(name = "ReliabilityAvailabilityScalability", nullable = false)
	private String reliability;
	
	@Column(name = "Availability", nullable = false)
	private String availability;
	
	@Column(name = "Scalability", nullable = false)
	private String scalability;

	@Column(name = "LicenseSupportCosts", nullable = false)
	private double licencingCost;

	@Column(name = "RateOfInterest", nullable = false)
	private String roi;
	
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Feature> features;

}
