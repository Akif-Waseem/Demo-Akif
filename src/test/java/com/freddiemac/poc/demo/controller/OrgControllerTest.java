package com.freddiemac.poc.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.freddiemac.poc.demo.dto.OrgDTO;
import com.freddiemac.poc.demo.repository.OrgRepository;
import com.freddiemac.poc.demo.service.OrgService;

@org.springframework.boot.test.context.SpringBootTest

class OrgControllerTest {

	@MockBean
	OrgRepository orgRepository;
	@Autowired
	OrgController orgController;
	@MockBean
	OrgService orgService;
	
	@Test
	void testSaveOrg() {
	OrgDTO org = new OrgDTO();
	org.setOrgId(1);
	org.setOrgName("Test Org");
	org.setOrgAddress(null);
	org.setOrgAccount(null);
	Mockito.when(orgService.saveOrg(org)).thenReturn(org);
	orgController.saveOrg(org);
	assertEquals(org, orgController.saveOrg(org));
	}

	// write test cases for getOrg method. with runtime exception.
	
	@Test()
	void testGetOrgRuntimeException() {
		// write test cases for getOrg method.

		Mockito.when(orgService.getOrg(1)).thenThrow(new RuntimeException());
		orgController.getOrg(1);
		assertEquals(null, orgController.getOrg(1));

	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	void testGetOrg() {
		// write test cases for getOrg method.

		Mockito.when(orgService.getOrg(1)).thenReturn(null);
		orgController.getOrg(1);
		assertEquals(null, orgController.getOrg(1));
		
		
		
	}

	@Test
	void testGetOrgs() {
		Mockito.when(orgService.getAllOrgs()).thenReturn(null);
		orgController.getOrgs();
		assertEquals(null, orgController.getOrgs());
		
	}

	@Test
	void testDeleteOrg() {
		Mockito.when(orgService.deleteOrg(1)).thenReturn(true);
		orgController.deleteOrg(1);
		assertEquals(true, orgController.deleteOrg(1));
		
	}

}
