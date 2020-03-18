package edu.escuelaing.arsw.parcial.service;

import java.util.List;

import edu.escuelaing.arsw.parcial.model.Airport;

public interface AirportFinderService {
    List<Airport> findAirportsByName(String name);

}