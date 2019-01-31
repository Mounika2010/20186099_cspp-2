import java.util.*;
class Sample{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username =  scan.nextLine();
		int walletsCount = Integer.parseInt(scan.nextLine()); 

		Wallet[] wallets = new Wallet[walletsCount];

		for (int i=0;i< walletsCount; i++ ) {
			String walletName =  scan.nextLine();
			Wallet obj =  new Wallet(walletName,1000);
			wallets[i]=obj;
			
		}	
		User user = new User(username,walletsCount,wallets);

		while(scan.hasNextLine()){
			String type =  scan.nextLine();
			switch(type){
				case "quit":
					System.out.println("Thank you");
					break;
				case "debit":
					String[] line = scan.nextLine().split(" ");
					Wallet temp=new Wallet();
					for (int i=0;i< walletsCount ;i++ ) {
						if(user.wallets[i].name.equals(line[0])){
							temp = user.wallets[i];
							break;
						}					
					}
					float amount =  Float.parseFloat(line[1]);
					if(amount>0 && temp.amount > amount){
						temp.amount= temp.amount- amount;
					}
					if(temp.amount<amount){
						System.out.println("Insufficient funds");
					}
					if(amount<0){
						System.out.println("Negative amount");
					}
					break;
				case "credit":
					String[] tokens = scan.nextLine().split(" ");
					Wallet temp1 =new Wallet();
					for (int i =0; i < walletsCount; i++) {
						if (user.wallets[i].name.equals(tokens[0])) {
							temp1= user.wallets[i];
							break;
						}
					}
					float amt = Float.parseFloat(tokens[1]);
					if (amt > 0) {
						temp1.amount = temp1.amount + amt;
					}
					if(amt<0){
						System.out.println("Negative amount");
					}
					break;
				case "balance":
					String name = scan.nextLine();
					Wallet temp2 = new Wallet();
					for (int i = 0; i < walletsCount; i++) {
						if (user.wallets[i].name.equals(name)) {
						temp2 = user.wallets[i];
						System.out.println(temp2.amount);
						break;
						}
					}
				// case "transfer":
				// 	String[] token = scan.nextLine().split(" ");
				// 	//Wallet temp3 = new Wallet();
				// 	//Wallet temp4 = new Wallet();
				// 	float transAmount = Float.parseFloat(token[2]);
				// 	for (int i =0; i < walletsCount; i++) {
				// 		if(user.wallets[i].amount < transAmount){
				// 			System.out.println("Insufficient funds");
				// 		}
				// 		if (user.wallets[i].name.equals(token[0])) {
				// 			//temp3 = user.wallets[i];
				// 			user.wallets[i].amount = user.wallets[i].amount - transAmount;
				// 			break;
				// 		}
				// 		if (user.wallets[i].name.equals(token[1])) {
				// 			//temp3 = user.wallets[i];
				// 			user.wallets[i].amount = user.wallets[i].amount + transAmount;
				// 			break;
				// 		}
				// }
			}

		}


		

		
	}
}

class User{
	String name;
	//ArrayList<Wallet> wallets;
	Wallet[] wallets;
	int numOfWallets;

	public User(String nam, int cnt, Wallet[] w){
		name = nam;
		numOfWallets = cnt;
		wallets =w;

	}

}

class Wallet{
	String name;
	float amount;
	Wallet() {

	}
	Wallet(String n, float k){
		name = n;
		amount = k;
	}
}