package com.lucidlense.analysis.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Component
@Data
@XmlRootElement
public class ProductRequestVo {
	@ApiModelProperty(notes = "The value for productName")
	private String productName;

	@ApiModelProperty(notes = "The value for DomainType")
	private String domainType;

	@ApiModelProperty(notes = "The value for features")
	private List<Feature> features;

	@ApiModelProperty(notes = "The value for operationalRegion")
	private String operationalRegion;

	@ApiModelProperty(notes = "The value for licenceType")
	private String licenceType;

	@ApiModelProperty(notes = "The value for technologyStack")
	private String technologyStack;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDomainType() {
		return domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public String getOperationalRegion() {
		return operationalRegion;
	}

	public void setOperationalRegion(String operationalRegion) {
		this.operationalRegion = operationalRegion;
	}

	public String getLicenceType() {
		return licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public String getTechnologyStack() {
		return technologyStack;
	}

	public void setTechnologyStack(String technologyStack) {
		this.technologyStack = technologyStack;
	}

}
