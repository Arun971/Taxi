package example;

public class TaxiBooking {
     char pickupPoint ;
     char dropPoint;
     int bookingTime;
     CallTaxi allocatedTaxi;
     int fare;

    public TaxiBooking(char pickupPoint, char dropPoint, int bookingTime, CallTaxi taxi, int fare) {
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.bookingTime = bookingTime;
        this.allocatedTaxi = taxi;
        this.fare = fare;
    }
}
