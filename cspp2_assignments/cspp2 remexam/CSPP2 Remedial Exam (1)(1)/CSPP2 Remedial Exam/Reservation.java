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

    private String[] hotelrooms;
    private int size;
 

    public Hotel () {
        hotelrooms = new String[5];
        size = 0;


    }

    public int reserveRoom(String person) {
    
        for (int i = 0; i < hotelrooms.length; i++) {
            if (hotelrooms[i] != null) {
                int k = 0+1;

            } else {
                hotelrooms[i] = person;
                size++;
                int p = i+1;
                return p;
            }
            
        }
        return -1;
    }

    public boolean reserveRoom(String person, int roomNum) {
        return true;

    }

    public void printReservations() {
        for (int i = 0;i < hotelrooms; i++) {
            if (
                hotelrooms[i] != null) {
                int j = i + 1;
                System.out.println(hotelrooms[i] + " " + j);
            }
        }
 
    }

    public void cancelReservations(String person) {

    }

    public void buildRooms(int num) {
        return true;

    }


}

   

   