package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.skill.SkillRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class SkillController {

    private SkillRepository skillRepository;

    public SkillController(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
    @RequestMapping(value = "/skills", method = RequestMethod.GET)
    public ResponseEntity getSkills() {
        return new ResponseEntity(skillRepository.findAll(), HttpStatus.OK);
    }
}
