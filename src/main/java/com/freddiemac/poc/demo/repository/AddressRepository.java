package com.freddiemac.poc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freddiemac.poc.demo.domain.AddressDomain;

@Repository
public interface AddressRepository extends JpaRepository<AddressDomain, Integer> {

}
