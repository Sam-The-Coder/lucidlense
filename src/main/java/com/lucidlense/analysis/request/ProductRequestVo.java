package com.lucidlense.analysis.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Component
@Data
@XmlRootElement
public class ProductRequestVo
{
    @ApiModelProperty(notes = "The value for productName")
    private String productName;

    @ApiModelProperty(notes = "The value for DomainType")
    private String DomainType;

    @ApiModelProperty(notes = "The value for features")
    private List<Feature> features;

    @ApiModelProperty(notes = "The value for operationalRegion")
    private String operationalRegion;

    @ApiModelProperty(notes = "The value for licenceType")
    private String licenceType;

    @ApiModelProperty(notes = "The value for technologyStack")
    private String technologyStack;

}
