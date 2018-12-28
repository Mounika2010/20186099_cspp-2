import java.util.*;
class Hotel{
	Reservation[] hotelrooms;
	int size;

	public Hotel() {
		size = 0;
		hotelrooms = new Reservation[6];
	}

	public int reserveRoom(String person) {
		if (size == hotelrooms.length-1) {
			System.out.println("All Rooms are reserved");
		}
		for (int i = 1; i < hotelrooms.length; i++) {
			if(hotelrooms[i] == null) {
				hotelrooms[i] = new Reservation(person, i);
				size++;
				return i;
 			}
			
		}
		return -1;

	}

	public boolean reserveRoom(String person, int roomNum) {
		if (size == hotelrooms.length-1) {
			System.out.println("All Rooms are reserved");
			return false;

		} else if (hotelrooms[roomNum] != null) {
			System.out.println("Room is already reserved");
			return false;
		} else {
			hotelrooms[roomNum] = new Reservation(person, roomNum);
			size++;
			return true;
		}

	}

	public void printReservations() {
		for (int i = 0; i < hotelrooms.length; i++) {
			if(hotelrooms[i] != null) {
				System.out.println(hotelrooms[i]);
			}
		}
	}

	public void cancelReservations(String person) {
		for (int i = 0; i < hotelrooms.length; i++) {
			if(hotelrooms[i].getpersonName().equals(person)) {
				hotelrooms[i] = null;
			}
		}

	}

	public boolean buildRooms(int num) {
		// Reservation[] newrooms = new Reservation[hotelrooms.length];
		hotelrooms = Arrays.copyOf(hotelrooms, hotelrooms.length+ num);
		return true;
	}
}