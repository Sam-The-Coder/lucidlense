package com.lucidlense.analysis.request;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Component
@Data
@XmlRootElement
public class ProductComparisionVo {

    private List<ProductRequestVo> productsRequestVo;
}
