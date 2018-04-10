package com.revature.hydraaggregatorservice.repository.curriculum;

import com.revature.hydraaggregatorservice.model.curriculum.Focus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FocusRepository extends CrudRepository<Focus, Integer> {

}
