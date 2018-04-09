package com.revature.hydraaggregatorservice.repository.curriculum;

import com.revature.hydraaggregatorservice.model.curriculum.Curriculum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumRepository extends CrudRepository<Curriculum, Integer> {
}
