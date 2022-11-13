package org.example.Fase1.Pruebas;//Se agrego esta linea de codigo para evitar errores

import org.example.Fase1.Produccion.Flight;//Importamos la clase Fligth para poder usarla
import org.example.Fase1.Produccion.Passenger;//Importamos la clase Passenger para poder usarla
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @DisplayName("Dado que hay un vuelo economico")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new Flight("1", "Economico");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);//Pasajero no VIP

            assertEquals("1", economyFlight.getId());//vuelo economico
            assertEquals(true, economyFlight.addPassenger(jessica));//asignar pasajero a un vuelo economico
            assertEquals(1, economyFlight.getPassengersList().size());//numero de pasajeros, vuelo economico
            assertEquals("Jessica", economyFlight.getPassengersList().get(0).getName());

            assertEquals(true, economyFlight.removePassenger(jessica));//eliminar pasajero vuelo economico
            assertEquals(0, economyFlight.getPassengersList().size());//numero de pasajeros, vuelo economico
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);//Pasajero VIP

            assertEquals("1", economyFlight.getId());//vuelo economico
            assertEquals(true, economyFlight.addPassenger(cesar));//asignar pasajero a un vuelo economico
            assertEquals(1, economyFlight.getPassengersList().size());//numero de pasajeros, vuelo economico
            assertEquals("Cesar", economyFlight.getPassengersList().get(0).getName());

            assertEquals(false, economyFlight.removePassenger(cesar));//eliminar pasajero VIP vuelo economico
            assertEquals(1, economyFlight.getPassengersList().size());//numero de pasajeros, vuelo economico
        }
    }

    @DisplayName("Dado que hay un vuelo de negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new Flight("2", "Negocios");
        }//Se reemplazo Business->Negocios

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);//Pasajero no VIP

            assertEquals(false, businessFlight.addPassenger(jessica));//asignar un pasajero no VIP a vuelo negocios
            assertEquals(0, businessFlight.getPassengersList().size());//numero de pasajeros
            assertEquals(false, businessFlight.removePassenger(jessica));//eliminar pasajero
            assertEquals(0, businessFlight.getPassengersList().size());//numero de pasajeros

        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);//pasajero VIP

            assertEquals(true, businessFlight.addPassenger(cesar));//asignar un pasajero VIP a vuelo negocios
            assertEquals(1, businessFlight.getPassengersList().size());//numero de pasajeros
            assertEquals(false, businessFlight.removePassenger(cesar));//eliminar pasajero VIP
            assertEquals(1, businessFlight.getPassengersList().size());//numero de pasajeros

        }
    }
}
