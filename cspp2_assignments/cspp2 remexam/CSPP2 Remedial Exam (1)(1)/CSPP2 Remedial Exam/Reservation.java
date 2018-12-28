public class Reservation{
    //instance variables
    private String personName;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String personName){
        this.personName = personName;
        

    }
    public Reservation(String personName, int roomNumber){
        this.personName = personName;
        this.roomNumber = roomNumber;

    }

    //mutators, set the room number or name
    public void setRoom(int newroomNumber){
        this.roomNumber = newroomNumber;
        
    }

    public void setName(String newpersonName){
        this.personName = newpersonName;
        
    }

    //accessors, return the room number or name
    public int getRoomNumber(){
        return this.roomNumber;
        
    }

    public String getpersonName(){
        return this.personName;
    }

    public String toString(){
        return this.personName + " "+this.roomNumber;
    }
}

