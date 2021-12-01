package com.chatassistant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.chatassistant.model.Product;
import com.chatassistant.model.ProductResponse;
import com.chatassistant.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EcomService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductResponse getAllProduct() {
		Pageable paging = PageRequest.of(0, 10);
		Page<Product> pgP = productRepository.findAll(paging);
		ProductResponse pdr = new ProductResponse();
		pdr.setProducts(pgP.getContent());
		pdr.setTotalCount(productRepository.count());
		return pdr;
	}

}
