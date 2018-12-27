/*
  Reservation class, stores the person and room number in the Hotel
*/

public class Reservation{
    //instance variables
    private String name;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String person){
    	this.name = person;

    }
    public Reservation(String person, int room){
        this.name = person;
        this.roomNumber = room;


    }

    //mutators, set the room number or name
    public void setRoom(int newroom){
    	this.roomNumber = newroom;
    }

    public void setName(String newname){
    	this.name = newname;
    }

    //accessors, return the room number or name
    public int getRoom(){
        return this.roomNumber;
    	
    }

    public String getName(){
        return this.name;
    	
    }

    public String toString() {
        return name + " " + roomNumber;
    }

    
}

class Hotel {

    private Reservation[] hotelrooms;
    private int size;
    int count = 0;

    public Hotel () {
        hotelrooms = new Reservation[5];
        size = 0;


    }

    public int reserveRoom(String person) {
        Reservation r = new Reservation(person);
        if(size == 0) {
            hotelrooms[count] = r;
            ++size;
            r.setRoom(count + 1);
            return ++count;
        }if (size >= hotelrooms.length) {
            System.out.println("All rooms are reserved");
        }
        if (size >= 1) {
            hotelrooms[count] = r;
            ++size;
            r.setRoom(count + 1);
        }
        return count++;
    
       
    }

    public boolean reserveRoom(String person, int roomNum) {
        return true;

    }

    public void printReservations() {
       
 
    }

    public void cancelReservations(String person) {

    }

    public boolean buildRooms(int num) {
        return true;

    }


}

   

   