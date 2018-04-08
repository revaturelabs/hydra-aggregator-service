package com.revature.hydraaggregatorservice.repository.skill;

import com.revature.hydraaggregatorservice.model.skill.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {
    Skill findByName(@Param("name") String name);
}
