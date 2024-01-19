package HMS;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagmentSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Hilton", new ArrayList<>(), new ArrayList<>());


        Room room1 = new Room(1, "Single", false);
        Room room2 = new Room(2, "Double", false);
        Room room3 = new Room(3, "Single", false);
        Room room4 = new Room(4, "Double", false);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);



        Reservation reservation1 = new Reservation(1, "John Doe", "1234567890", "2021-01-01", "2021-01-02", 1);
        Reservation reservation2 = new Reservation(2, "Jane Doe", "0987654321", "2021-01-01", "2021-01-02", 2);
        Reservation reservation3 = new Reservation(3, "John Smith", "1234567890", "2021-01-01", "2021-01-02", 1);
        Reservation reservation4 = new Reservation(4, "Jane Smith", "0987654321", "2021-01-01", "2021-01-02", 2);

        hotel.addReservation(reservation1);
        hotel.addReservation(reservation2);
        hotel.addReservation(reservation3);
        hotel.addReservation(reservation4);


        // make a while loop that will run until the user enters 0

        while (true) {
            System.out.println("Welcome to " + hotel.getName());
            System.out.println("1. View all rooms");
            System.out.println("2. View all reservations");
            System.out.println("3. Add a reservation");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRooms(hotel);
                    break;
                case 2:
                    displayReservations(hotel);

                    break;
                case 3:
                    System.out.println("Please enter the room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the guest name: ");
                    String guestName = scanner.nextLine();
                    System.out.println("Please enter the guest phone: ");
                    String guestPhone = scanner.nextLine();
                    System.out.println("Please enter the check in date: ");
                    String checkInDate = scanner.nextLine();
                    System.out.println("Please enter the check out date: ");
                    String checkOutDate = scanner.nextLine();
                    System.out.println("Please enter the number of guests: ");
                    int numberOfGuests = scanner.nextInt();

                    Reservation reservation = new Reservation(roomNumber, guestName, guestPhone, checkInDate, checkOutDate, numberOfGuests);
                    hotel.addReservation(reservation);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayRooms(Hotel hotel) {
        System.out.printf("Rooms in %s: %n", hotel.getName());
        System.out.println("----------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s |%n", "Room Number", "Room Type", "Occupied");
        System.out.println("----------------------------------------------------");
        for (Room room : hotel.getRooms()) {
            System.out.printf("| %-10d | %-10s | %-10s |%n", room.getRoomNumber(), room.getRoomType(), room.isOccupied());
        }
        System.out.println("----------------------------------------------------");
    }

    public static void displayReservations(Hotel hotel) {
        System.out.printf("Reservations in %s: %n", hotel.getName());
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-20s | %-20s | %-20s | %-20s |%n", "Room Number", "Guest Name", "Guest Phone", "Check In Date", "Check Out Date", "Number of Guests");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (Reservation reservation : hotel.getReservations()) {
            System.out.printf("| %-10d | %-20s | %-20s | %-20s | %-20s | %-20d |%n", reservation.getRoomNumber(), reservation.getGuestName(), reservation.getGuestPhone(), reservation.getCheckInDate(), reservation.getCheckOutDate(), reservation.getNumberOfGuests());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
