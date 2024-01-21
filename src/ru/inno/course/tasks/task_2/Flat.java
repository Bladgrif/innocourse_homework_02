package ru.inno.course.tasks.task_2;

import ru.inno.course.tasks.task_3.Room;

public class Flat {
    public String countOfRooms;
    public Room room1,
            room2,
            room3;

    public Flat() {
        this.countOfRooms = "Unknown";
    }

    public Flat(int countOfRooms, Room room1) {
        this.countOfRooms = Integer.toString(countOfRooms);
        this.room1 = room1;
    }

    public Flat(int countOfRooms, Room room1, Room room2) {
        this.countOfRooms = Integer.toString(countOfRooms);
        this.room1 = room1;
        this.room2 = room2;
    }

    public Flat(int countOfRooms, Room room1, Room room2, Room room3) {
        this.countOfRooms = Integer.toString(countOfRooms);
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }
}

