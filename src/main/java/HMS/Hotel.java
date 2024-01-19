package HMS;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Hotel class with name, rooms (List of Room objects), reservations (List of Reservation objects)
public class Hotel {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    private Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    // Constructor
    public Hotel(String name, ArrayList<Room> rooms, ArrayList<Reservation> reservations) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = reservations;

    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = (ArrayList<Room>) rooms;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = (ArrayList<Reservation>) reservations;
    }

    // toString method
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", reservations=" + reservations +
                '}';
    }

    // Method to add a room to the rooms list
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Method to add a reservation to the reservations list
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Method to remove a room from the rooms list
    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    // Method to remove a reservation from the reservations list
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    // Method to get a room by room number
    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    // Method to get a reservation by room number
    public Reservation getReservation(int roomNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getRoomNumber() == roomNumber) {
                return reservation;
            }
        }
        return null;
    }

    // Method to get a list of available rooms
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}