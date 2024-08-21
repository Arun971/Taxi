
import example.CallTaxi;
import example.TaxiBooking;
import example.TaxiService;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService(4);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Taxi Name: ");
            System.out.println("2. Taxi Booking: ");
            System.out.println("3. Find Available Taxi: ");
            System.out.println("4. Calculate Fare: ");
            System.out.println("5. Find Nearest Taxi:");
            System.out.println("6. Display Earning:");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter  id: ");
                    String st = scanner.next();
                    System.out.println("Enter Current Location: ");
                    char ch = scanner.next().charAt(0);
                    System.out.println("Enter TotalEarning:");
                    int ut = scanner.nextInt();
                    CallTaxi callTaxi= new CallTaxi(st);
                    callTaxi.updateLocation(ch,ut);
                    System.out.println("Add Taxi");
                    break;
                case 2:
                    System.out.println("Enter The PickupPoint: ");
                    char gh= scanner.next().charAt(0);
                    System.out.println("Enter The  DropPoint: ");
                    char th = scanner.next().charAt(0);
                    System.out.println("Enter The BookingTime:");
                    int it = scanner.nextInt();
                    TaxiBooking booking =taxiService.processBooking(gh,th,it);
                    System.out.println("Add booking");
                    break;
                case 3:
                   char nt = scanner.next().charAt(0);
                    System.out.println( taxiService.findAvailableTaxi(nt));
                    break;
                case 4:
                    System.out.println("Enter the distance: ");
                    int  n=scanner.nextInt();
                    System.out.println(taxiService.calculateFare(n));
                    break;
                case 5:
                    char oi =scanner.next().charAt(0);
                    System.out.println(taxiService.findNearestAvailableTaxi(oi));
                    break;
                case 6:
                    taxiService.displayEarning();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

}
