import java.util.*;
import java.io.*;
class Users {
	String name;
	ArrayList<String> followers;
	Users(String user, ArrayList<String> followers) {
		this.name = user;
		this.followers = followers;

	}
}


class SocialNetwork {
	ArrayList<Users> user;

	SocialNetwork() {
		user = new ArrayList<Users>();

	}

	public void addUser(Users u) {
		user.add(u);

	}

	public void addConnection(Users u) {
		boolean variable = false;
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).name.equals(u.name)) {
				for (int j = 0; j < u.followers.size(); j++) {
					user.get(i).followers.add(u.followers.get(j));
					
				}
				variable = true;

			}
			if (!variable) {
				System.out.println("Not a user in Network");
			}
		}

	}
	
	public ArrayList<String> getConnections(String a) {
		for (int i =0; i < user.size(); i++) {
			if (user.get(i).name.equals(a)) {
				return user.get(i).followers;
			}
		}
		return null;
	}

	public void getCommonConnections(String a, String b) {
		ArrayList<String> listA;
		ArrayList<String> listB;
		listA = new ArrayList<String>();
		listB = new ArrayList<String>();
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).name.equals(a)) {
				listA = getConnections(a);

			}
			if (user.get(i).name.equals(b)) {
				listB = getConnections(b);

			}

		}
		ArrayList<String> str;
		str = new ArrayList<String>();
		for (String i : listA) {
			if (listB.contains(i)) {
				str.add(i);
	
			}

		}
		System.out.println(str);

	}

public void network() {
		for (int i = 0; i < user.size(); i++) {
			System.out.print(user.get(i).name + ": ");
			System.out.print(user.get(i).followers + ", ");
		}
		System.out.println();
	}
}

class Solution {
	public static void main(String[] args) {
		SocialNetwork s = new SocialNetwork();
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String token = input.nextLine();
			String[] list1 = token.split(" ");
			// System.out.println(Arrays.toString(list1));
			switch (list1[0]) {
			case "Create":
				for (int i = 0; i < Integer.parseInt(list1[1]); i++) {
					String[] line1 = input.nextLine().replace(", ", ",").split("\\.");
					String[] line2 = line1[0].split(" is connected to ");
					String[] line3 = line2[1].split(",");
					// System.out.println(Arrays.toString(line2));
					// System.out.println(Arrays.toString(line3));
					String n = line2[0];
					ArrayList<String> f;
					f = new ArrayList<String>(line3.length - 1);
					for (int j = 0; j < line3.length; j++) {
						f.add(line3[j]);
					}
					s.addUser(new Users(n, f));
				}
				break;
			case "addConnections":
				String s1 = list1[1];
				ArrayList<String> s2;
				s2 = new ArrayList<String>(list1.length - 2);
				for (int i = 2; i < list1.length; i++) {
					s2.add(list1[i]);
				}
				s.addConnection(new Users(s1, s2));
				break;
			case "getConnections":

				if (s.getConnections(list1[1]) == null) {
					System.out.println("Not a user in Network");
				} else {
					System.out.println(s.getConnections(list1[1]));
				}

				break;
			case "CommonConnections":
				s.getCommonConnections(list1[1], list1[2]);
				break;
			case "Network" :
				s.network();
				break;
			}
		}
	}
}










