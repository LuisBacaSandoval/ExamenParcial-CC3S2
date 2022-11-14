package org.example.Fase5.Produccion;

import org.example.Fase5.Produccion.Flight;

public class PremiumFlight extends Flight {
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
    //solo se le otorgara el vuelo al cliente VIP
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        //se puede eliminar el cliente del vuelo
        return passengers.remove(passenger);
    }

}