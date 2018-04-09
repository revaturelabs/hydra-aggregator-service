package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.batch.BatchRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class BatchController {

    private BatchRepository batchRepository;

    public BatchController(BatchRepository batchRepository) {
        this.batchRepository = batchRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "/batches", method = RequestMethod.GET)
    public ResponseEntity getBatches() {
        return new ResponseEntity(batchRepository.findAll(), HttpStatus.OK);
    }
}
