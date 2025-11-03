package finalExercise;

import java.util.ArrayList;

public class Company {
    public String name;
    public String address;
    public int roomCount;
    public int maxRoomCapacity;
    private int roomNumber = 0;
    public ArrayList<Room> rooms = new ArrayList<>();

    public Company(String name, String address, int roomCount, int maxRoomCapacity) {
        this.name = name;
        this.address = address;
        this.roomCount = roomCount;
        this.maxRoomCapacity = maxRoomCapacity;
    }
    public void addRoom(int capacity){
        roomNumber++;
        rooms.add(new Room(roomNumber, capacity, false));
    }
    public void searchRoom(int capacity){
        for(Room room : rooms){
            if(room.capacity == capacity){
                System.out.println(room.roomNumber + ", " + "Anzahl Personen: " + room.capacity);
            }
            if (room.capacity != capacity){
                System.out.println("Keine Räume verfügbar die zu Ihrer Grösse passen");
                break;
            }
        }
    }
    public void freeRooms(){
        if (rooms.size() == 0) {
            System.out.println("Keine Räume verfügbar");
        }
        if (rooms.size() != 0) {
            for (Room room : rooms) {
                if (!room.isBooked) {
                    System.out.println(room.roomNumber + ", " + "Anzahl Personen: " + room.capacity);
                }
            }
        }
    }
    public void bookRoom(int RoomNumber){
        if (rooms.size() != 0) {
            for (Room room : rooms) {
                if (room.getRoomNumber() == RoomNumber) {
                    room.isBooked = true;
                }
            }
        }
    }

    public String toString(){
        return this.name + " " + this.address + " " + this.roomCount + " " + this.maxRoomCapacity;
    }
}