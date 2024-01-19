package HMS;

// Room class with room number, type and occupied (boolean)
public class Room {
    private int roomNumber;
    private String roomType;
    private boolean occupied;

    // Constructor
    public Room(int roomNumber, String roomType, boolean occupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    // toString method
    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", occupied=" + occupied +
                '}';
    }

}
