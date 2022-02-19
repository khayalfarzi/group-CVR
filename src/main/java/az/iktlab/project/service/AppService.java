package az.iktlab.project.service;
import az.iktlab.project.entity.PassengerFlight;

import java.util.List;

public interface AppService {
    void book(int serialNumber, List<Friend> friends) ;
    void cancelBooking(int flightId) ;
    List<PassengerFlight> myFlights();
    void exit() ;
}
