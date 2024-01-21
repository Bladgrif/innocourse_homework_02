package ru.inno.course.tasks;

import ru.inno.course.Flat;
import ru.inno.course.Room;


public class Task2 {

    public static void main(String[] args) {
        Room diningRoom = new Room("DiningRoom", false, 2);
        Room bedRoom = new Room("BedRoom", true, 1);
        Room livingRoom = new Room("LivingRoom", false, 3);
        Flat myFlat = new Flat(2, diningRoom, bedRoom);

        System.out.println(myFlat.countOfRooms);
        System.out.println(myFlat.room1.theNameOfTheRoom);
        System.out.println(myFlat.room2.theNameOfTheRoom);
    }
}
