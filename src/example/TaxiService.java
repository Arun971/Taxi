package example;

import java.util.*;

public class TaxiService {
    List<CallTaxi> taxis;
    Map<Character,Integer> locations;

    public TaxiService(int numTaxis){
        this.taxis= new ArrayList<>();
        this.locations= new HashMap<>();

        for (int i=1;i<=numTaxis;i++){
            taxis.add(new CallTaxi("Taxies"+i));
        }
        locations.put('A',0);
        locations.put('B',5);
        locations.put('C',10);
        locations.put('D',15);
        locations.put('E',20);
        locations.put('F',25);
    }
    public TaxiBooking processBooking(char pickupPoint,char dropPoint,int bookingTime){
        CallTaxi selectedTaxi = findAvailableTaxi('A');
        if (selectedTaxi==null){
            System.out.println("Booking rejected: No taxi available.");
            return null;
        }
        int distance = Math.abs(locations.get(dropPoint)-locations.get(pickupPoint));
        int fare = calculateFare(distance);
        selectedTaxi.isAvailable= false;
        selectedTaxi.updateLocation(dropPoint,fare);
        return new TaxiBooking(pickupPoint,dropPoint,bookingTime,selectedTaxi,fare);
    }

    public  CallTaxi findAvailableTaxi(char location) {
        return taxis.stream().filter(taxi -> taxi.currentLocation==location && taxi.isAvailable).min(Comparator.comparingInt(t -> t.totalEarnings)).orElse(null);
    }

    public CallTaxi findNearestAvailableTaxi(char pickPiont) {
        for (CallTaxi taxi: taxis){
            System.out.println("Taxi"+ taxi.id+ "taxipoint"+taxi.isAvailable);
        }
        return null;
    }

    public int calculateFare(int distance) {
        int fare=0;
        if (distance<=5){
            fare=100;
        }else if (distance<=15){
            fare = 100+(distance -5) * 10;
        } else if (distance<=25) {
            fare = 100 + 100 +(distance -15) *8;
        }else {
            fare= 100 + 100 + 80 +(distance -25) *5;
        }
        return fare;
    }
    public void displayEarning(){
        System.out.println(" TotalEarning:");
        for (CallTaxi taxi: taxis){
            System.out.println("Taxi "+taxi.id+":RS"+taxi.totalEarnings);
        }
    }

}
