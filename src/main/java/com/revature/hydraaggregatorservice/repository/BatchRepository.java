package com.revature.hydraaggregatorservice.repository;

import com.revature.hydraaggregatorservice.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer> {
}
