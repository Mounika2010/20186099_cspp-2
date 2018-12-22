/*
  Reservation class, stores the person and room number in the Hotel
*/

public class Reservation{
    //instance variables
    private String name;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String person){
    	this.person = person;


    }
    public Reservation(String person, int room){
        this.person = person;
        this.room = room;

        

    }

    //mutators, set the room number or name
    public void setRoom(int newroom){
    	this.newrroom = newroom;
    }

    public void setName(String newname){
        this.name = newname
    }

    //accessors, return the room number or name
    public int getRoom(){
    	return this.room;
    }

    public String getName(){
        return this.name;
    	
    }

    // public String toString() {
    //     String str = "name" + "\n";
    //     str += "room :" + getRoom() + "\n";
    //     str += "name :" + getName() + "\n";
    // }
}

public class Hotel{

    Hotel() {

    }
    

    public int reserveRoom(String person) {
        return 0;

    }

    public boolean reserveRoom(String person, int roomNum) {
        return 0;
        

    }

    public void printReservations() {
        return 0;

    }

    public void cancelReservations(String person) {
        retun 0;
    }

}