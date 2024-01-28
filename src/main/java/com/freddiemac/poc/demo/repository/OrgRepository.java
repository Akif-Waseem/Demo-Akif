package com.freddiemac.poc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freddiemac.poc.demo.domain.OrgDomain;

@Repository
public interface OrgRepository extends JpaRepository<OrgDomain, Integer>{
	
	// craete method to get org details of largest org id.
	OrgDomain findTopByOrderByOrgIdDesc();
	
	// craete method to get org details if account domain is present.
	OrgDomain findByAccountDomain_AccountId(Integer accountId);
	
	// craete method to get org details if address domain is present.
	OrgDomain findByAddressDomain_AddressId(Integer addressId);
	
	// craete method to get Address domain by org id.
	OrgDomain findByAddressDomain_OrgId(Integer orgId);

	

}
