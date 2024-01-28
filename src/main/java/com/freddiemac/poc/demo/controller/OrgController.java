package com.freddiemac.poc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freddiemac.poc.demo.dto.OrgDTO;
import com.freddiemac.poc.demo.service.OrgService;

@RestController
public class OrgController {

	@Autowired
	OrgService orgService;
	// call org service to save org details.
	@PostMapping("/saveOrg")
	public OrgDTO saveOrg(OrgDTO org) {
		return orgService.saveOrg(org);
	}
	
	// get org details by org id.
	@GetMapping("/getOrg/{orgId}")
	public OrgDTO getOrg(@PathVariable Integer orgId) {
		return orgService.getOrg(orgId);
	}
	
	// get all orgs from org service.
	@GetMapping("/getOrgs")
	public List<OrgDTO> getOrgs() {
		return orgService.getAllOrgs();
	}
	
	// delete org details by org id.
	@GetMapping("/deleteOrg/{orgId}")
	public boolean deleteOrg(@PathVariable Integer orgId) {
		return orgService.deleteOrg(orgId);
	}
	
}
