package org.example.Fase4.Produccion;

import org.example.Fase4.Produccion.Flight;

public class PremiumFlight extends Flight {
    // Diseño inicial de la clase  PremiumFlight. Pregunta 7
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }

}

