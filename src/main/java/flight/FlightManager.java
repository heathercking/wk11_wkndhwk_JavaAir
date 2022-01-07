package flight;

public class FlightManager {

    public int getPlaneTotalWeight(Flight flight) {
        return flight.getPlaneTotalWeight();
    }

    public int getPlaneCapacity(Flight flight) {
        return flight.getPlaneCapacity();
    }

    public int getIndividualBaggageAllowance(Flight flight) {
        return (getPlaneTotalWeight(flight) / 2) / getPlaneCapacity(flight);
    }

    public int getBookedBaggageWeight(Flight flight) {
        return flight.passengerCount() * getIndividualBaggageAllowance(flight);
    }

    public int getAvailableBaggageWeight(Flight flight) {
        return (getPlaneTotalWeight(flight) / 2) - getBookedBaggageWeight(flight);
    }
}
