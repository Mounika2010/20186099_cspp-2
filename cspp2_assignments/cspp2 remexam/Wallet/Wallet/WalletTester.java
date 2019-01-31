import java.util.Scanner;
class Wallet {
	double balance;
	String name;

	public Wallet(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public double availbalance() {
		return this.balance;
	}
	public void credit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("Negative amount");
		}
	}
	public void debit(double amount) {
		if (amount > 0) {
			if (amount <= balance)
				this.balance -= amount;
			else {
				//throw new InsufficientBalanceException("amount cannot be debited");
				System.out.println("Insufficient funds");
			}
		} else {
			System.out.println("Negative amount");
		}
	}
	public void transfer(Wallet other, double amount) {
		if (amount <= balance) {
			this.balance -= amount;
			other.balance += amount;
		} else
			System.out.println("Insufficient funds");
	}

}
class User {
	String name;
	Wallet w[];
	int c = 0;
	User(int n) {
		w = new Wallet[n];
	}
	public void addWallet(String wallet_name) {
		w[c++] = new Wallet(wallet_name, 1000.0);
	}
	
}
public class WalletTester {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int c = 0;
		int num = Integer.parseInt(s.nextLine());
		User u = new User(num);
		u.name = name;
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
			case "credit":
				String input = s.nextLine();
				String tok[] = input.split(" ");
				name = tok[0];

				int amount = Integer.parseInt(tok[1]);
				c = 0;
				while (c < num) {

					if (u.w[c].name.equals(name)) {

						u.w[c].credit(amount);
						flag = 1;
						break;
					}
					c++;
				}
				if (flag == 0)
					System.out.println("No such account exists");
				break;
			case "transfer":

				input = s.nextLine();
				tok = input.split(" ");

				 Wallet one = new Wallet();
				  Wallet two = new Wallet();


				for (int i = 0; i < u.w.length; i++) {
					System.out.println(u.w[i].name);
					if (u.w[i].name.equals(tok[0])) {
						one=u.w[i];
					}
					if (u.w[i].name.equals(tok[1])) {
						two=u.w[i];
					}

				}

				one.transfer(two,tok[2]);
				amount = Integer.parseInt(tok[1]);
				while (c < num) {
					if (u.w[c].name.equals(name)) {
						// u.w[c].transfer(,amount); 
						flag = 1;
						break;
					}
					c++;
				}
				if(flag == 0)
					System.out.println("No such account exists");

				break;

			case "debit":
				input = s.nextLine();
				tok = input.split(" ");
				name = tok[0];
				amount = Integer.parseInt(tok[1]);
				c = 0;
				while (c < num) {
					if (u.w[c].name.equals(name)) {
						u.w[c].debit(amount);
						flag = 1;
						break;
					}
					c++;
				}
				if (flag == 0)
					System.out.println("No such account exists");
				break;
			case "balance":
				input = s.nextLine();
				c = 0;
				flag = 0;
				while (c < num) {
					if (u.w[c].name.equals(input)) {
						System.out.println(u.w[c].availbalance());
						flag = 1;
						break;
					}
					c++;
				}
				if (flag == 0)
					System.out.println("No such account exists");
				break;

			}
		}
	}
}
