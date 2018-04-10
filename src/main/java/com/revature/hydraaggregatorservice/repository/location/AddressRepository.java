package com.revature.hydraaggregatorservice.repository.location;

import com.revature.hydraaggregatorservice.model.location.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
