package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.settings.AssignforceSettingsRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class SettingsController {

    private AssignforceSettingsRepository assignforceSettingsRepository;

    public SettingsController(AssignforceSettingsRepository assignforceSettingsRepository) {
        this.assignforceSettingsRepository = assignforceSettingsRepository;
    }

    @RequestMapping(value = "/assignforce-settings", method = RequestMethod.GET)
    public ResponseEntity getAssignforceSettings() {
        return new ResponseEntity(assignforceSettingsRepository.findAll(), HttpStatus.OK);
    }
}
