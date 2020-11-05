package com.lucidlense.analysis.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucidlense.analysis.entity.Feature;
import com.lucidlense.analysis.entity.ProductDetails;
import com.lucidlense.analysis.repository.ProductAnalysisRepo;
import com.lucidlense.analysis.request.ProductComparisionVo;
import com.lucidlense.analysis.request.ProductRequestVo;
import com.lucidlense.analysis.response.ProductAnalysisReportVo;

@Repository
@Transactional
public class ProductAnalysisRepoImpl implements ProductAnalysisRepo {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addproduct(ProductRequestVo productRequestVo) {
		ProductDetails pd = new ProductDetails();
		Feature feature = null;
		pd.setAvailability("Yes");
		pd.setCapability("Up to 10 Instances");
		pd.setCustomers("20");
		pd.setCustomerSentimentRating("8");
		pd.setDescription("Description");
		pd.setDevelopmentCost("1234500");
		pd.setDomainType(productRequestVo.getDomainType());
		pd.setGoals("Customer Satisfaction");
		pd.setInnovation("Available");
		pd.setIntegration("Possible");
		pd.setInteroperability("Yes");
		pd.setLegalCompliance("Yes");
		pd.setLicencingCost("123450");
		pd.setLicenceType(productRequestVo.getLicenceType());
		pd.setMaintenanceCosts("12345678");
		pd.setOperationalRegion(productRequestVo.getOperationalRegion());
		pd.setProductName(productRequestVo.getProductName());
		pd.setReliability("Yes");
		pd.setRevenue("1234567890");
		pd.setRoi("5");
		pd.setScalability("Yes");
		pd.setSecurity("Yes");
		pd.setSecurityRating("9");
		pd.setSocialImpact("High");
		pd.setSupportService("Yes");
		pd.setTechnologyStack(productRequestVo.getTechnologyStack());
		pd.setThreats("No");
		pd.setUiFriendliness("Yes");
		pd.setUsability("High");
		pd.setLicencingPolicyAndCost("12345678");
		pd.setVision("Long Racing");
		//pd.setFeatures(productRequestVo.getFeatures());
		entityManager.persist(pd);
		
		feature = new Feature();
		feature.setName("Lucid Lense");
		feature.setProduct(pd);
		entityManager.persist(feature);

//		if (!productRequestVo.getFeatures().isEmpty()) {
//			for (com.lucidlense.analysis.request.Feature ftre : productRequestVo.getFeatures()) {
//				feature = new Feature();
//				feature.setName(ftre.getFeatureName());
//				feature.setProduct(pd);
//				entityManager.persist(feature);
//			}
//		}
	}

	@Override
	public List<ProductAnalysisReportVo> generateProductDeatils(ProductRequestVo productRequestVo) {
		List<ProductDetails> products = getProducts(productRequestVo);
		Collections.sort(products, Comparator.comparing(ProductDetails::getProductName)
				.thenComparing(ProductDetails::getDomainType).thenComparing(ProductDetails::getTechnologyStack));
		return convert(products);
	}

	@Override
	public List<ProductAnalysisReportVo> productcomparision(ProductComparisionVo comparisionVo) {
		List<ProductDetails> products = new ArrayList<>();
		for(ProductRequestVo productRequestVo : comparisionVo.getProductsRequestVo()) {
			products.addAll(getProducts(productRequestVo));
		}

		Collections.sort(products, Comparator.comparing(ProductDetails::getProductName)
				.thenComparing(ProductDetails::getDomainType).thenComparing(ProductDetails::getTechnologyStack));

		return convert(products);
	}

	private List<ProductDetails> getProducts(ProductRequestVo productRequestVo) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ProductDetails> query = cb.createQuery(ProductDetails.class);
		Root<ProductDetails> productVO = query.from(ProductDetails.class);
		List<Predicate> predicates = new ArrayList<>();

		if (productRequestVo.getProductName() != null
				&& productRequestVo.getProductName().toString().trim().length() > 0) {
			predicates.add(cb.equal(productVO.get("productName"), productRequestVo.getProductName()));
		}
		if (productRequestVo.getDomainType() != null
				&& productRequestVo.getDomainType().toString().trim().length() > 0) {
			predicates.add(cb.equal(productVO.get("domainType"), productRequestVo.getDomainType()));
		}
		if (productRequestVo.getOperationalRegion() != null
				&& productRequestVo.getOperationalRegion().toString().trim().length() > 0) {
			predicates.add(cb.equal(productVO.get("operationalRegion"), productRequestVo.getOperationalRegion()));
		}
		if (productRequestVo.getLicenceType() != null
				&& productRequestVo.getLicenceType().toString().trim().length() > 0) {
			predicates.add(cb.equal(productVO.get("licenceType"), productRequestVo.getLicenceType()));
		}
		if (productRequestVo.getTechnologyStack() != null
				&& productRequestVo.getTechnologyStack().toString().trim().length() > 0) {
			predicates.add(cb.equal(productVO.get("technologyStack"), productRequestVo.getTechnologyStack()));
		}
//		if (!productRequestVo.getFeatures().isEmpty()) {
//			Feature f = new Feature();
//			f.setName(productRequestVo.getFeatures().get(0).getFeatureName());
//			predicates.add(cb.in(productVO.get("features"), productRequestVo.getFeatures()));
//		}

		query.where(predicates.stream().toArray(Predicate[]::new)).distinct(true);
		return entityManager.createQuery(query).getResultList();
	}

	private List<ProductAnalysisReportVo> convert(List<ProductDetails> products) {
		List<ProductAnalysisReportVo> vos = new ArrayList<>();
		products.forEach(product -> {
			ProductAnalysisReportVo vo = new ProductAnalysisReportVo();
			vo.setAvailability(product.getAvailability());
			vo.setCustomers(product.getCustomers());
			vo.setCustomerSentimentRating(product.getCustomerSentimentRating());
			vo.setDescription(product.getDescription());
			vo.setDevelopmentCost(product.getDevelopmentCost());
			vo.setDomain(product.getDomainType());
			List<com.lucidlense.analysis.request.Feature> features = new ArrayList<>();
			for (Feature feature : product.getFeatures()) {
				com.lucidlense.analysis.request.Feature ftre = new com.lucidlense.analysis.request.Feature();
				ftre.setFeatureName(feature.getName());
				features.add(ftre);
			}
			vo.setFeatures(features);
			vo.setInnovation(product.getInnovation());
			vo.setIntegration(product.getIntegration());
			vo.setInteroperability(product.getInteroperability());
			vo.setLegalCompliance(product.getLegalCompliance());
			vo.setLicencingCost(product.getLicencingCost());
			vo.setLicenseType(product.getLicenceType());
			vo.setMaintenanceCosts(product.getMaintenanceCosts());
			vo.setOperationalRegion(product.getOperationalRegion());
			vo.setProductName(product.getProductName());
			vo.setReliability(product.getReliability());
			vo.setRevenue(product.getRevenue());
			vo.setScalability(product.getScalability());
			vo.setSecurity(product.getSecurity());
			vo.setSecurityRating(product.getSecurityRating());
			vo.setSocialImpact(product.getSocialImpact());
			vo.setSupportService(product.getSupportService());
			vo.setTechnologyStack(product.getTechnologyStack());
			vo.setUiFriendliness(product.getUiFriendliness());
			vo.setUsability(product.getUsability());
			vo.setVision(product.getVision());
			vo.setLicenseType(product.getLicenceType());

			vos.add(vo);
		});

		return vos;
	}

}
