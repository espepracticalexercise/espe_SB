/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.crud_app.controller;

import espe.edu.ec.crud_app.service.FlightService;
import espe.edu.ec.crud_app.model.Flight;
import espe.edu.ec.crud_app.model.Flightsave;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author saint-rec
 */
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class FlightControllers {

    public static final Logger logger = LoggerFactory.getLogger(FlightControllers.class);

    @Autowired
    private FlightService flightService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello to CrudApp!";
    }

//Also, The @GetMapping("/users") annotation is a short form of -->
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<Flight> list() {
        logger.info("Fetching all Client");
        List<Flight> clients = flightService.list();
        return new ResponseEntity(clients, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Flight> userById(@PathVariable long id) {
        logger.info("Fetching Client with id {}", id);
        Optional<Flight> client = flightService.get(id);
        return new ResponseEntity(client, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Flightsave> create(@Valid @RequestBody Flightsave client) {
                Flightsave clientCreated = flightService.create(client);
        return new ResponseEntity(clientCreated, HttpStatus.CREATED);
    }

}
