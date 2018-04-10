package com.revature.hydraaggregatorservice.repository.trainers;

import com.revature.hydraaggregatorservice.model.trainers.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
    Trainer findByEmail(@Param("email") String email);
}
