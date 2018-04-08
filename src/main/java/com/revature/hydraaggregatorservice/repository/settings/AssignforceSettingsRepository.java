package com.revature.hydraaggregatorservice.repository.settings;

import com.revature.hydraaggregatorservice.model.settings.AssignforceSettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignforceSettingsRepository extends CrudRepository<AssignforceSettings, Integer> {
}
