package org.example.Fase1.Produccion;//Se agrego esta linea de codigo para evitar errores

public class Airport {

    public static void main(String[] args) {
        Flight economyFlight = new Flight("1", "Economico");
        Flight businessFlight = new Flight("2", "Negocios");

        Passenger cesar = new Passenger("Cesar", true); //Pasajero VIP
        Passenger jessica = new Passenger("Jessica", false);//Pasajero que no es VIP

        businessFlight.addPassenger(cesar);//Pasajero que tendra un vuelo de negocios
        businessFlight.removePassenger(cesar);//Nose puede eliminar un pasajero que tiene un vuelo de negocios
        businessFlight.addPassenger(jessica);//No es pasajero VIP asi que no puede tener un vuelo de negocios
        economyFlight.addPassenger(jessica);//Pasajero que tendra un vuelo economico

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }//Mostrara la lista de pasajeros que tienen vuelos de negocios

        System.out.println("Lista de pasajeros de vuelos de economicos:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }//Mostrara la lista de pasajeros que tienen vuelos de economicos
    }
}
