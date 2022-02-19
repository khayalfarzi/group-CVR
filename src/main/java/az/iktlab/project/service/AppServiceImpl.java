package az.iktlab.project.service;

import az.iktlab.project.entity.PassengerFlight;
import java.util.List;

public class AppServiceImpl implements AppService {

    @Override
    public void book(int serialNumber, List<Friend> friends) {
    }

    @Override
    public void cancelBooking(int flightId) {
    }

    @Override
    public List<PassengerFlight> myFlights() {
        return null;
    }

    @Override
    public void exit() {
        System.out.println(" Good Bye! ");
        System.exit(1);
    }
}
