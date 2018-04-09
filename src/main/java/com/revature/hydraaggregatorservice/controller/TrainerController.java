package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.trainers.TrainerRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class TrainerController {

    private TrainerRepository trainerRepository;

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "/trainers", method = RequestMethod.GET)
    public ResponseEntity getTrainers() {
        return new ResponseEntity(trainerRepository.findAll(), HttpStatus.OK);
    }
}
