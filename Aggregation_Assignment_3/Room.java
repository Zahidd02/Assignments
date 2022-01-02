package Aggregation_Assignment_3;

public class Room {
    private int roomNo;
    private int capacity;
    private static int roomCounter;
    static {
        Room.roomCounter = 500;
    }

    public Room() {
        this.roomNo = roomCounter++;
        this.capacity = 4;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomCounter() {
        return Room.roomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        Room.roomCounter = roomCounter;
    }
}
