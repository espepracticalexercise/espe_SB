/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.crud_app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.persistence.Table;

/**
 *
 * @author saint-rec
 */
@Entity
@Table(name = "flightreserva")
public class Flightsave implements Serializable {

    private static final long serialVersionUID = 0L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("first_name")
    private String firstname;

    @JsonProperty("last_name")
    private String lastname;

    @JsonProperty("place_flight")
    private String flightplace;

    @JsonProperty("date_flight")
    private String flightdate;

    public Flightsave() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFlightplace() {
        return flightplace;
    }

    public void setFlightplace(String flightplace) {
        this.flightplace = flightplace;
    }

    public String getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(String flightdate) {
        this.flightdate = flightdate;
    }

}