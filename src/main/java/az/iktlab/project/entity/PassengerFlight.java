package az.iktlab.project.entity;

public class PassengerFlight {
        private Long passengerId;
        private Long flightId;

    public PassengerFlight() {
    }

    public PassengerFlight(Long passengerId, Long flightId) {
        this.passengerId = passengerId;
        this.flightId = flightId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        return "PassengerFlight{" +
                "passengerId=" + passengerId +
                ", flightId=" + flightId +
                '}';
    }
}

