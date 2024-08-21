package Taxi;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<MainTaxi> taxi = new ArrayList<>();


    public List<MainTaxi> getTaxi() {
        return taxi;
    }

    public void setTaxi(List<MainTaxi> taxi) {
        this.taxi = taxi;
    }
    public  List<MainTaxi> taxi() {
        return new ArrayList<>(taxi);
    }
}

