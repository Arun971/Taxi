package example;

public class CallTaxi {

    String id;
    char currentLocation;
    int totalEarnings;
    boolean isAvailable;

    public CallTaxi(String id){
        this.id=id;
        this.currentLocation='A';
        this.totalEarnings=0;
        this.isAvailable=true;
    }
    public void updateLocation(char newLocation,int fare){
        this.currentLocation= newLocation;
        this.totalEarnings+=fare;
        this.isAvailable=true;
    }
}
