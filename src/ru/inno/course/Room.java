package ru.inno.course;

public class Room {
    public String theNameOfTheRoom;
    public boolean theLockOnTheDoor;
    public int numberOfChandeliers;

    public Room(String theNameOfTheRoom, boolean theLockOnTheDoor, int numberOfChandeliers) {
        this.theNameOfTheRoom = theNameOfTheRoom;
        this.theLockOnTheDoor = theLockOnTheDoor;
        this.numberOfChandeliers = numberOfChandeliers;
    }
}
