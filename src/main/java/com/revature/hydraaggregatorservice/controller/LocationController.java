package com.revature.hydraaggregatorservice.controller;

import com.revature.hydraaggregatorservice.repository.location.AddressRepository;
import com.revature.hydraaggregatorservice.repository.location.BuildingRepository;
import com.revature.hydraaggregatorservice.repository.location.LocationRepository;
import com.revature.hydraaggregatorservice.repository.location.RoomRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
public class LocationController {
    private AddressRepository addressRepository;
    private BuildingRepository buildingRepository;
    private LocationRepository locationRepository;
    private RoomRepository roomRepository;

    public LocationController(AddressRepository addressRepository, BuildingRepository buildingRepository, LocationRepository locationRepository, RoomRepository roomRepository) {
        this.addressRepository = addressRepository;
        this.buildingRepository = buildingRepository;
        this.locationRepository = locationRepository;
        this.roomRepository = roomRepository;
    }

    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    public ResponseEntity getAddresses() {
        return new ResponseEntity(addressRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/buildings", method = RequestMethod.GET)
    public ResponseEntity getBuildings() {
        return new ResponseEntity(buildingRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public ResponseEntity getLocations() {
        return new ResponseEntity(locationRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public ResponseEntity getRooms() {
        return new ResponseEntity(roomRepository.findAll(), HttpStatus.OK);
    }
}