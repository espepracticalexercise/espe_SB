/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.crud_app.service;

import espe.edu.ec.crud_app.model.Flight;
import espe.edu.ec.crud_app.model.Flightsave;
import espe.edu.ec.crud_app.repository.FlightRepository;
import espe.edu.ec.crud_app.repository.FlightsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saint-rec
 */
@Service
public class FlightService {

    @Autowired
    private FlightRepository repository;

    @Autowired
    private FlightsRepository repositorys;
    
    public Optional<Flight> get(long clientId) {
        return repository.findById(clientId);
    }

    public List<Flight> list() {
        Iterable<Flight> clients = repository.findAll();
        List<Flight> list = new ArrayList<Flight>();
        clients.forEach(list::add);
        return list;
    }

    public Flightsave create(Flightsave client) {
        return repositorys.save(client);
    }

}
