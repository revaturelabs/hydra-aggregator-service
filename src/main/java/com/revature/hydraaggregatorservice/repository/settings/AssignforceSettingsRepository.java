package com.revature.hydraaggregatorservice.repository.settings;

import com.revature.hydraaggregatorservice.model.settings.AssignforceSettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "assignforce-settings")
public interface AssignforceSettingsRepository extends CrudRepository<AssignforceSettings, Integer> {
}
