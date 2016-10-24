/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefan
 */
public class CustomTests {
    
    
    
    public CustomTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getFlightsTest() {
        
        List<Flight> flights;
        flights = getFlights("CPH Airport", "Morocco", "22-12-2016");
        assertEquals(1, flights.size()); //59T9X0
        Flight flight = flights[0]; //No .get() ?
        assertEquals("59T9X0", flight.getBookingNumber());
        assertEquals(200.0, flight.getPrice());
        assertEquals("Flyv.dk", flight.getReservationService());
        assertEquals("CPH Airport", flight.getStartAirport());
        assertEquals("Marrakech Menara Airport", flight.getDestinationAirport());
        assertEquals("22-12-2016 20:45", flight.getLiftOffTime());
        assertEquals("22-12-2016 00:00", flight.getLandingTime());
        assertEquals("SAS", flight.getCarrier());
        
    }
    
}
