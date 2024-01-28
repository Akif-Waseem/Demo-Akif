package com.freddiemac.poc.demo.service;

import java.util.List;

import com.freddiemac.poc.demo.dto.OrgDTO;

public interface OrgService {
	
	OrgDTO getOrg(Integer orgId);
	List<OrgDTO> getAllOrgs();
	OrgDTO saveOrg(OrgDTO org);
	OrgDTO updateOrg(OrgDTO org);
	boolean deleteOrg(Integer orgId);
	

}
