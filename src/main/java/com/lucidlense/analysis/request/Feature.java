package com.lucidlense.analysis.request;

import lombok.Data;
import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

@Component
@Data
@XmlRootElement
public class Feature {
	@ApiModelProperty(notes = "The value for featureName")
	private String featureName;

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

}
