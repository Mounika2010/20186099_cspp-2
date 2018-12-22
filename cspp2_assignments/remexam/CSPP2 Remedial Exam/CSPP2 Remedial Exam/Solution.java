import java.util.*;
/**
 * Class for main.
 */
/*
  Reservation class, stores the person and room number in the Hotel
*/


class Solution{

  public static void main(String[] args){
  		Hotel h = new Hotel();
		String name;
		int roomnum;
  		Scanner scan = new Scanner(System.in);
		int readLines = Integer.parseInt(scan.nextLine());
		int c=0;
		while (c<readLines) {
			String line = scan.nextLine();
			String tokens[]=line.split(" ");
				switch(tokens[0])
				{
					case "reserve":
									name = tokens[1];
									roomnum = -1;
								    //if we got a good name, try to reserve a room
								    if(!((name==null) || (name.equals(""))))
								        roomnum = h.reserveRoom(name);

								    //give feedback
								    if(roomnum!=-1)
								        System.out.println(name+" "+roomnum);
								 
									break;

					case "reserveN":
									name = tokens[1];
									//if we got a bad input, report failure

								    if((name==null) || (name.equals("")))
								        roomnum = -1;
								    else{
								     roomnum = Integer.parseInt(tokens[2]);
								    }    
								    //give feedback
								    if(h.reserveRoom(name, roomnum))
								        System.out.println(name+" "+roomnum);
								    
								    break;

					case "print":
								//print all the reservations done in the hotel
								h.printReservations();
								 break;
					case "cancel":
								//cancel the rooms for that particular person
								name = tokens[1];
								if(!((name==null) || (name.equals("")))){
								        h.cancelReservations(name);
								        System.out.println(name+" now has no reservations.");
								    }else{
								        System.out.println("No input");
   								 }
   								 break;
					case "build":
								//add more number of rooms to the existing rooms
								roomnum = Integer.parseInt(tokens[1]);
								
							    if(h.buildRooms(roomnum))
							        System.out.println("Added "+roomnum+" more rooms");
							    else
							        System.out.println("No rooms are added");
							      break;
				}
				c++;
		}
	}
}

class Reservation{
    //instance variables
    private String name;
    private int roomNumber;
    private String person;
    private int room;
    private int newroom;
    private String newname;
    //constructors, must supply the name, and optionally a room
    public Reservation(String person){
    	// this.person = person;


    }
    public Reservation(String person, int room){
        // this.person = person;
        // this.room = room;

        

    }

    //mutators, set the room number or name
    public void setRoom(int newroom){
    	this.newroom = newroom;
    }

    public void setName(String newname){
        this.name = newname;
    }

    //accessors, return the room number or name
    public int getRoom(){
    	return this.room;
    }

    public String getName(){
        return this.name;
    	
    }

    public String toString() {
        String str = "name" + "\n";
        str += "room :" + getRoom() + "\n";
        str += "name :" + getName() + "\n";
        return str;
    }
}

class Hotel{

	private String person;
	private int roomNum;
    Hotel() {


    }
    

    public int reserveRoom(String person) {
        return 1;

    }

    public boolean reserveRoom(String person, int roomNum) {
        return false;
        

    }

    public void printReservations() {
        // return null;

    }

    public void cancelReservations(String person) {
        // return null;
    }

    public boolean buildRooms(int num) {
    	return true;
    }

}
