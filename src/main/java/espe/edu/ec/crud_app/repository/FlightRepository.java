/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.crud_app.repository;

import espe.edu.ec.crud_app.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saint-rec
 */
@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
