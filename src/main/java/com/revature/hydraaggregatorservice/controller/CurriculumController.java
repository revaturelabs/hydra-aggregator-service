package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.curriculum.CurriculumRepository;
import com.revature.hydraaggregatorservice.repository.curriculum.FocusRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class CurriculumController {

    private CurriculumRepository curriculumRepository;
    private FocusRepository focusRepository;

    public CurriculumController(CurriculumRepository curriculumRepository, FocusRepository focusRepository) {
        this.curriculumRepository = curriculumRepository;
        this.focusRepository = focusRepository;
    }

    @CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
    @RequestMapping(value = "/curricula", method = RequestMethod.GET)
    public ResponseEntity getCurricula() {
        return new ResponseEntity(curriculumRepository.findAll(), HttpStatus.OK);
    }

    @CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
    @RequestMapping(value = "/focuses", method = RequestMethod.GET)
    public ResponseEntity getFocuses() {
        return new ResponseEntity(focusRepository.findAll(), HttpStatus.OK);
    }
}
