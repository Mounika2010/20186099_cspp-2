
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
        this.person = person;


    }
    public Reservation(String person, int room){
        this.person = person;
        this.room = room;

        

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
        roomNum.add(person);



        
    }

    public boolean reserveRoom(String person, int roomNum) {
        person.add(roomNum);
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
