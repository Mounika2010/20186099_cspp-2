import java.util.*;
public class Hotel{

	Reservation[]rooms;
	int size;

	public Hotel(){
		rooms = new Reservation[6];
		size = 1;
	}
	public int size(){
		return size;
	}
	public int reserveRoom(String person){
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
		}
		int i = 1;
		for ( i = 1;i <rooms.length;i++) {
			if (rooms[i]== null) {
				rooms[i] = new Reservation(person,i);
				size++;
				return i;
			}
		}
		return -1;
		
	}
	public boolean isEmpty(int roomNumber){
		for (int i = 1;i < rooms.length;i++){
			if (rooms[roomNumber]== null) {
				return true;
			}
		}
		return false;
	}
	public boolean reserveRoom(String person,int roomNumber){
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
			return false;
		}else if(!isEmpty(roomNumber)){
			System.out.println("Room is already reserved");
			return false;
		} else {
			rooms[roomNumber] = new Reservation(person,roomNumber);
			size++;
		}
		return true;
	}
	public void printReservations(){
		for (int i = 1;i < rooms.length;i++) {
			if (rooms[i]!= null) {
				System.out.println(rooms[i]);
			}
		}
	}
	public void cancelReservations(String person){
		for (int i = 0;i < size ;i++) {
			if (rooms[i]!= null) {
				if (rooms[i].getpersonName().equals(person)) {
					rooms[i] = null;
				}
			}
			
		}
	}
		public boolean buildRooms(int num) {
			Reservation[] temp = new Reservation[rooms.length+num];
			System.arraycopy(rooms,0,temp,0,rooms.length);
			rooms = temp;
			return true;
			}


}
