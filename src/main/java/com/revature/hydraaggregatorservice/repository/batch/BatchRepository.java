package com.revature.hydraaggregatorservice.repository.batch;

import com.revature.hydraaggregatorservice.model.batch.Batch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends CrudRepository<Batch, Integer> {
}
