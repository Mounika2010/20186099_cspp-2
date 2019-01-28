import java.util.Scanner;


class User {
	String name;
	Wallet[] walletarray;
	int size;


	public User(int size) {
		size = 0;
		walletarray = new Wallet[size];
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}



	
	public int addWallet(String name) {
		for (int i = 0; i < walletarray.length; i++) {
			if (walletarray.length == 0) {
				walletarray[i] = new Wallet();
				size++;
				return i;
			}
		}
		return -1;
	}
}

class Wallet {
	String nameofperson;
	double amount;


	Wallet() {
		amount = 1000.0;
	}

	public void credit() {
		if (amount == 0.0) {

		}
	}

	public void debit() {

	}

	public int availBalance() {
		return 0;
	}

	public void transfer() {

	}
}






public class Solution {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int c = 0;
		int num = Integer.parseInt(s.nextLine());
		User u = new User(num);
		u.setName(name);
		for (int i = 0; i < num; i++) {
			u.addWallet(s.nextLine());

		}
		c = 0;
		int flag = 0;
		while (s.hasNext()) {
			String operation = s.nextLine();
			if (operation.equals("quit")) {
				System.out.println("Thank you");
				break;
			}
			switch (operation) {
				//Please complete the code for credit,debit,transfer and balance operations 
			case "credit":
				
				break;
			case "transfer":
				
				break;

			case "debit":
				
				break;
			case "balance":
				
				break;

			}
		}
	}
}
