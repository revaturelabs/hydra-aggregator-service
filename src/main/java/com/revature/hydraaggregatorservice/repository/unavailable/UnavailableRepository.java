package com.revature.hydraaggregatorservice.repository.unavailable;

import com.revature.hydraaggregatorservice.model.unavailable.Unavailable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnavailableRepository extends CrudRepository<Unavailable, Integer> {
}
