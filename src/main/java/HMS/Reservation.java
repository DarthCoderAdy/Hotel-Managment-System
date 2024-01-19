package HMS;

// Reservation class with roomNumber, guestName, guestPhone, checkInDate, checkOutDate, numberOfGuests
public class Reservation {
    private int roomNumber;
    private String guestName;
    private String guestPhone;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    // Constructor
    public Reservation(int roomNumber, String guestName, String guestPhone, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.guestPhone = guestPhone;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    // toString method
    @Override
    public String toString() {
        return "Reservation{" +
                "roomNumber=" + roomNumber +
                ", guestName='" + guestName + '\'' +
                ", guestPhone='" + guestPhone + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}
