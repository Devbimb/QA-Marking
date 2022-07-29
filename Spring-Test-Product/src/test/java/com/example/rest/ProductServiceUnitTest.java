package com.example.rest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.Product;
import com.example.repo.ProductRepo;
import com.example.service.ProductService;

@SpringBootTest
public class ProductServiceUnitTest {

	@Autowired
    private ProductService service;
	
    @MockBean
    private ProductRepo repo;
    
    @Test
    void testCreate(){
        // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
        final Product TEST_PERSON = p2("Mouse", "Sony");
        final Product TEST_SAVED_PERSON = p2("Mouse", "Sony");
        // WHEN
        Mockito.when(this.repo.save(TEST_PERSON)).thenReturn(TEST_SAVED_PERSON);
        // THEN
        Assertions.assertThat(this.service.addProduct(TEST_PERSON)).isEqualTo(TEST_SAVED_PERSON);
        // verify that our repo was accessed exactly once
        Mockito.verify(this.repo, Mockito.times(1)).save(TEST_PERSON);
    }
    					//not sure of what I did below
	private Product p2(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
