class Slot {
	String name;
	Slot(String n) {
		name = n;
	}
	String getName() {
		return name;
	}

}
class Parking {
	int size;
	Slot[] slots;
	
	Parking(int n) {
		size = 0;
		slots = new Slot[n];
	}
	int carsCount() {
		return size;
	}
	void addToSlot(Slot name) {
		for(int i = 0; i < slots.length; i++) {
			if(slots[i] == null) {
				slots[i] = name;
				size++;
				return;
			}
		}	
	}
	Slot getSlot(String name) {
		for(int i = 0; i < size; i++) {
			if(slots[i] != null && slots[i].getName().equals(name)) {
				return slots[i];
			}
		}
		return null;
	} 
	int getEmptySlots() {
		int count = 0;
		for(int i = 0; i < slots.length; i++) {
			if(slots[i] == null) {
				count++;
			}
		}
		return count;
	}

	void removeFromSlot(String name) {
		for(int i = 0; i < slots.length; i++) {
			if(slots[i] != null && slots[i].getName().equals(name)) {
				slots[i] = null;
				size--;
			}
		}
	}
	void clearSlots() {
		size = 0;
		int n = slots.length;
		for(int i = 0; i < n; i++) {
			slots[i] = null;
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Parking parking = new Parking(10);

		if (parking.carsCount() == 0) {
			System.out.println("Testcase 1 passed");
		} else {
			System.out.println("Testcase 1 failed");
		}

		parking.addToSlot(new Slot("Murthy"));

		if (parking.getSlot("Murthy").getName().equals("Murthy")) {
			System.out.println("Testcase 2 passed");
		} else {
			System.out.println("Testcase 2 failed");
		}
		
		parking.addToSlot(new Slot("Vamshi"));
		System.out.print(parking);
		parking.addToSlot(new Slot("Deepak"));
		parking.addToSlot(new Slot("Rajni"));

		if (parking.getSlot("Deepak") != null) {
			System.out.println("Testcase 3 passed");
		} else {
			System.out.println("Testcase 3 failed");	
		}



		if (parking.carsCount() == 4) {
			System.out.println("Testcase 4 passed");
		} else {
			System.out.println("Testcase 4 failed");
		}

		parking.removeFromSlot("Rehana");

		if (parking.carsCount() == 4) {
			System.out.println("Testcase 5 passed");
		} else {
			System.out.println("Testcase 5 failed");
		}

		System.out.print(parking);

		parking.removeFromSlot("Deepak");

		if (parking.carsCount() == 3) {
			System.out.println("Testcase 6 passed");
		} else {
			System.out.println("Testcase 6 failed");
		}

		if (parking.getSlot("Deepak") == null) {
			System.out.println("Testcase 7 passed");
		} else {
			System.out.println("Testcase 7 failed");	
		}

		if (parking.getEmptySlots() == 7) {
			System.out.println("Testcase 8 passed");
		} else {
			System.out.println("Testcase 8 failed");
		}

		System.out.print(parking);
		parking.clearSlots();

		if (parking.carsCount() == 0) {
			System.out.println("Testcase 9 passed");
		} else {
			System.out.println("Testcase 9 failed");
		}

		if (parking.getEmptySlots() == 10) {
			System.out.println("Testcase 10 passed");
		} else {
			System.out.println("Testcase 10 failed");
		}

	}
}










