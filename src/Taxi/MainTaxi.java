package Taxi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainTaxi {
    private long id;
    private String taxiName;
    private int taxiNumber;

    public MainTaxi(long id, String taxiName, int taxiNumber) {
        this.id = id;
        this.taxiName = taxiName;
        this.taxiNumber = taxiNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaxiName() {
        return taxiName;
    }

    public void setTaxiName(String taxiName) {
        this.taxiName = taxiName;
    }

    public int getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    public String toString(){
        return "MainTaxi{" +
                "Id='" + id + '\'' +
                ", taxiName='" +taxiName+ '\'' +
                ",taxiNumber=" +taxiNumber +
                '}';
    }

}
