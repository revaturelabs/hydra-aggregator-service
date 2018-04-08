package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.curriculum.CurriculumRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class CurriculumController {

    private CurriculumRepository curriculumRepository;

    public CurriculumController(CurriculumRepository curriculumRepository) {
        this.curriculumRepository = curriculumRepository;
    }

    @RequestMapping(value = "/curricula", method = RequestMethod.GET)
    public ResponseEntity getCurricula() {
        return new ResponseEntity(curriculumRepository.findAll(), HttpStatus.OK);
    }
}
