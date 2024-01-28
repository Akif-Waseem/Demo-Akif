package com.freddiemac.poc.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freddiemac.poc.demo.domain.AccountDomain;
import com.freddiemac.poc.demo.domain.AddressDomain;
import com.freddiemac.poc.demo.domain.OrgDomain;
import com.freddiemac.poc.demo.dto.AccountDTO;
import com.freddiemac.poc.demo.dto.AddressDTO;
import com.freddiemac.poc.demo.dto.OrgDTO;
import com.freddiemac.poc.demo.repository.OrgRepository;

@Service
public class OrgServiceImpl implements OrgService {

	@Autowired	
	private OrgRepository orgRepository;

	// describe getOrg method.
	
	/**
	 * This method is used to get Org details by orgId.
	 * 	    1. get OrgDoamin from OrgRepository by orgId. if orgId is null then throw exception.
	 *      2. check orgid should between 1 to 100. then throw exception.
	 *      3. convert OrgDomain to OrgDTO.
	 *      4. convert AddressDomain to AddressDTO.
	 *      5. convert AccountDomain to AccountDTO.
	 *      6. return OrgDTO.
	 *         
	 */
	
	
	@Override
	public OrgDTO getOrg(Integer orgId) {
		// get OrgDoamin from OrgRepository by orgId. if orgId is null then throw exception.
		if (orgId == null) {
			throw new RuntimeException("Org Id is null");
		}
		// check orgid should between 1 to 100. then throw exception.
		
		if (orgId < 1 || orgId > 100) {
			throw new RuntimeException("Org Id is not valid");
		}
		
		
		OrgDomain orgdomain = orgRepository.findById(orgId).orElseThrow(() -> new RuntimeException("Org Id is not valid"));
		
		
		// convert OrgDomain to OrgDTO.
		
		OrgDTO orgDTO = new OrgDTO();
		orgDTO.setOrgId(orgdomain.getOrgId());
		orgDTO.setOrgName(orgdomain.getOrgName());
		// convert AddressDomain to AddressDTO.
		//@TODO I teach  how to convert AddressDomain to AddressDTO and AccountDomain to AccountDTO.
		List<AddressDTO> addressDTOs = new ArrayList<>();
		orgdomain.getOrgAddress().forEach(addressdomain -> {
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setAddressId(addressdomain.getAddressId());
			addressDTO.setStreetAddress(addressdomain.getStreetAddress());	
			addressDTOs.add(addressDTO);
		});
		
		// convert AccountDomain to AccountDTO.
		List<AccountDTO> accountDTOs = new ArrayList<>();
		orgdomain.getOrgAccount().forEach(accountdomain -> {
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAccountId(accountdomain.getAccountId());
			accountDTO.setAccountName(accountdomain.getAccountName());
			accountDTOs.add(accountDTO);
		});
		
		
		orgDTO.setOrgAddress(addressDTOs);
		orgDTO.setOrgAccount(accountDTOs);
		
		
		
		// return OrgDTO.
		
		return orgDTO;
		
		
		
	}

	// describe getAllOrgs method.
	
	/**
     * This method is used to get all Org details.
     * 	    1. get all OrgDoamin from OrgRepository.
     *      2. convert OrgDomain to OrgDTO.
     *      3. convert AddressDomain to AddressDTO.
     *      4. convert AccountDomain to AccountDTO.
     *      5. return all OrgDTO.
     *         
     */
	@Override
	// Fully auto generated method.
	public List<OrgDTO> getAllOrgs() {
		// get ALl org domain from OrgRepository.
		List<OrgDomain> orgdomains = orgRepository.findAll();
		// convert OrgDomain to OrgDTO.
		List<OrgDTO> orgDTOs = new ArrayList<>();
		orgdomains.forEach(orgdomain -> {
			OrgDTO orgDTO = new OrgDTO();
			orgDTO.setOrgId(orgdomain.getOrgId());
			orgDTO.setOrgName(orgdomain.getOrgName());
			// convert AddressDomain to AddressDTO.
			List<AddressDTO> addressDTOs = new ArrayList<>();
			orgdomain.getOrgAddress().forEach(addressdomain -> {
				AddressDTO addressDTO = new AddressDTO();
				addressDTO.setAddressId(addressdomain.getAddressId());
				addressDTO.setStreetAddress(addressdomain.getStreetAddress());
				addressDTOs.add(addressDTO);
			});

			// convert AccountDomain to AccountDTO.
			List<AccountDTO> accountDTOs = new ArrayList<>();
			orgdomain.getOrgAccount().forEach(accountdomain -> {
				AccountDTO accountDTO = new AccountDTO();
				accountDTO.setAccountId(accountdomain.getAccountId());
				accountDTO.setAccountName(accountdomain.getAccountName());
				accountDTOs.add(accountDTO);
			});

			orgDTO.setOrgAddress(addressDTOs);
			orgDTO.setOrgAccount(accountDTOs);
			orgDTOs.add(orgDTO);
		});
		
		// return all OrgDTO.
		return orgDTOs;
		
		
	}
	
	//describe saveOrg method.
	
	/**
     * This method is used to save Org details.
     * 	    1. convert OrgDTO to OrgDomain.
     *      2. convert AddressDTO to AddressDomain.
     *      3. convert AccountDTO to AccountDomain.
     *      4. save OrgDTO to OrgRepository.
     *      5. return OrgDTO.
     *         
     */

	@Override
	public OrgDTO saveOrg(OrgDTO org) {
		// convert OrgDTO to OrgDomain.
		OrgDomain orgdomain = new OrgDomain();
		orgdomain.setOrgId(org.getOrgId());
		orgdomain.setOrgName(org.getOrgName());
		// convert AddressDTO to AddressDomain.
		List<AddressDTO> addressDTOs = org.getOrgAddress();
		//TODO Not Used Address domain class in array instead used DTO manually corrected
		List<AddressDomain> addressDTOs2 = new ArrayList<>();
		addressDTOs.forEach(addressDTO -> {
			//TODO Not Used Address domain class instead used DTO manually corrected
			AddressDomain addressDTO2 = new AddressDomain();
			addressDTO2.setAddressId(addressDTO.getAddressId());
			addressDTO2.setStreetAddress(addressDTO.getStreetAddress());
			addressDTOs2.add(addressDTO2);
		});
		// convert AccountDTO to AccountDomain.
		List<AccountDTO> accountDTOs = org.getOrgAccount();
		List<AccountDomain> accountDTOs2 = new ArrayList<>();
		accountDTOs.forEach(accountDTO -> {
			AccountDomain accountDTO2 = new AccountDomain();
			accountDTO2.setAccountId(accountDTO.getAccountId());
			accountDTO2.setAccountName(accountDTO.getAccountName());
			accountDTOs2.add(accountDTO2);
		});
		orgdomain.setOrgAddress(addressDTOs2);
		orgdomain.setOrgAccount(accountDTOs2);
		
		
		// save OrgDTO to OrgRepository.
		
		orgRepository.save(orgdomain);
		
		
		// return OrgDTO.
		
		return org;
		
		
		
		
	}

	@Override
	public OrgDTO updateOrg(OrgDTO org) {
		// TODO Auto-generated method stub
		
		// convert OrgDTO to OrgDomain.
		OrgDomain orgdomain = new OrgDomain();
			orgdomain.setOrgId(org.getOrgId());
			orgdomain.setOrgName(org.getOrgName());
			// convert AddressDTO to AddressDomain.
			List<AddressDTO> addressDTOs = org.getOrgAddress();
			List<AddressDomain> addressDTOs2 = new ArrayList<>();
			addressDTOs.forEach(addressDTO -> {
				AddressDomain addressDTO2 = new AddressDomain();
				addressDTO2.setAddressId(addressDTO.getAddressId());
				addressDTO2.setStreetAddress(addressDTO.getStreetAddress());
				addressDTOs2.add(addressDTO2);
			});
			// convert AccountDTO to AccountDomain.
			List<AccountDTO> accountDTOs = org.getOrgAccount();
			List<AccountDomain> accountDTOs2 = new ArrayList<>();
			accountDTOs.forEach(accountDTO -> {
				AccountDomain accountDTO2 = new AccountDomain();
				accountDTO2.setAccountId(accountDTO.getAccountId());
				accountDTO2.setAccountName(accountDTO.getAccountName());
				accountDTOs2.add(accountDTO2);
			});
			orgdomain.setOrgAddress(addressDTOs2);
			orgdomain.setOrgAccount(accountDTOs2);
			
			// update OrgDTO to OrgRepository.
			
			orgRepository.save(orgdomain);
			
			// return OrgDTO.
			
			return org;
	}

	// describe deleteOrg method.
	/**
     * This method is used to delete Org details.
     * 	    1. check org id exist or not.
     *      2. if org id exist delete the Org from database.
     *      3. if org deleted return true.
     *         
     */
	
	@Override
	public boolean deleteOrg(Integer orgId) {
		// TODO Auto-generated method stub
		
		//check org id exist or not.
		OrgDomain orgdomain = orgRepository.findById(orgId).orElseThrow(() -> new RuntimeException("Org Id is not valid"));
		
		// if org id exist delete the Org from database.
		
		orgRepository.delete(orgdomain);
		
		//if org deleted return true.
		
		return true;
		
	}

}
