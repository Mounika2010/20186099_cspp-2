import java.util.Scanner;


class User {
	String name;
	int walletarray;
	int count;
	String[] personName;

	public User(int wallets) {
		this.walletarray = wallets;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}



	
	public void addWallet(String name) {
		personName[count++] = name;
	}
}

class Wallet {
	User nameofperson;
	double amount = 1000.0;

	public Wallet() {
		this.amount = 0;
	}

	public Wallet(User nameofperson, int amt) {
		this.amount = amt;
		this.nameofperson= nameofperson;
	}


	public void credit(int amt) {
		
		amount = 1000.0;
		amount = amount + amt;

	}

	public void debit(String name, int rupees) {
		if (rupees < amount) {
			System.out.println("Insufficient funds");
		}

		if (rupees < 0.0) {
			System.out.println("Negative amount");
		}
		else {
			amount = amount - rupees;
		}
		
	}

	public double availBalance(double amount) {
		return amount;
	}

// 	public void transfer() {

// 	}
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
