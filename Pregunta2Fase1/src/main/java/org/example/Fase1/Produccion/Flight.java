package org.example.Fase1.Produccion;//Se agrego esta linea de codigo para evitar errores

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {

    private String id;//id del vuelo
    private List<Passenger> passengers = new ArrayList<Passenger>();//lista de pasajeros
    private String flightType;//tipo de vuelo

    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
    }//constructor de la clase, asigna id/flightType

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    public String getFlightType() {
        return flightType;
    }

    public boolean addPassenger(Passenger passenger) {
        switch (flightType) {
            case "Economico":
                return passengers.add(passenger);
            case "Negocios":
                if (passenger.isVip()) {
                    return passengers.add(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Tipo desconocido: " + flightType);
        }

    }//agregamos un pasajero a un vuelo, negocios/economico

    public boolean removePassenger(Passenger passenger) {
        switch (flightType) {
            case "Economico":
                if (!passenger.isVip()) {
                    return passengers.remove(passenger);
                }
                return false;
            case "Negocios":
                return false;
            default:
                throw new RuntimeException("Tipo desconocido: " + flightType);
        }
    }//eliminamos un pasajero de un vuelo economico

}
