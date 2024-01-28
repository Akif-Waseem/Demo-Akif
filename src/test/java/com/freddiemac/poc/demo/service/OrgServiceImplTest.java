package com.freddiemac.poc.demo.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.freddiemac.poc.demo.repository.OrgRepository;

@org.springframework.boot.test.context.SpringBootTest
class OrgServiceImplTest {

	@MockBean
	OrgRepository orgRepository;
	@Autowired
	OrgService orgService;

	// write test cases for OrgServiceImpl getOrgs method.
	
	@Test
	void testGetOrgs() {
		
		
	}
	
	
	
	
	@Test
	void testGetOrg() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllOrgs() {
		fail("Not yet implemented");
	}

	
	
	
	
	
	
	@Test
	void testSaveOrg() {
		// Add Mock object for OrgDTO
	}

	@Test
	void testUpdateOrg() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteOrg() {
		fail("Not yet implemented");
	}

}
