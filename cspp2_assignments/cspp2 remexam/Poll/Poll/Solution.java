import java.util.Scanner;
import java.util.Arrays;

class Question{

	String questionss;
	String[] options;
	int size;

	Question(String questionss, String[] options) {
		this.questionss = questionss;
		this.options = options;
		System.out.println(questionss);
		System.out.println(Arrays.toString(options));
		size = 0;
		options = new String[4];

	}

	public void setOptionVotes(int votes) {
			int op1 = 0;
			int op2 = 0;
			int op3 = 0;
			int op4 = 0;

			if(votes == 0) {
				op1++;
			}

			else if (votes == 1) {
				op2++;
			}
			else if (votes == 2) {
				op3++;
			}

			else {
				op4++;
			}

			int maximumvotes = 0;
			if (op1 > op2 && op1 > op2 && op1 > op3 && op1 > op4) {
				maximumvotes = 0;
			}
			if (op2 > op3 && op2 > op3 && op2 > op1 && op1 > op4) {
				maximumvotes = 1;
			}

			return;

	}

	public int indexOf(String[] options){
		for (int i = 0; i < 4; i++) {
			if (options[i].equals(options)) {
				return i;
			}
		}

		return 0;
	}


}

class Quiz{
	Question[] questions;
	int size;
	int n;
	Quiz() {
		size = 0;
		questions = new Question[10];

	}

	public void addQuestion(Question q) {
		questions[size] = q;
		size++;
		// System.out.println(size);

	}

	public Question getQuestion(int i) {
		return questions[i];
	}

	public String commonSelectedOption() {
		return null;
	}



}

class Participant{

	String name;
	int optionnumber;
	String optionselected;


	Participant(String n, int optionnumber, String optionselected) {

		this.name = n;
		this.optionnumber = optionnumber;
		this.optionselected = optionselected;
	}

	public String getName(String nameofperson) {
		return null;
	}



}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Quiz quiz = new Quiz();
		int questions = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < questions; i++) {
			String question = scan.nextLine();
			String[] options = new String[4];
			for (int j = 0; j < options.length; j++) {
				options[j] = scan.nextLine();
			}
			quiz.addQuestion(new Question(question, options));
		}

		int participants = Integer.parseInt(scan.nextLine());
		for (int k = 0; k < participants; k++) {
			String name = scan.nextLine();
			for (int l = 0; l < questions; l++) {
				String[] lines = scan.nextLine().split(" ");
				int q = Integer.parseInt(lines[0]);
				Participant p = new Participant(name, q-1, lines[1]);
				Question question = quiz.getQuestion(q-1);
				// question.setOptionVotes(question.indexOf(lines[1]));
			}
		}

		// for (int i = 0; i < questions; i++) {
		// 	System.out.println("Highest number of votes for question : "+ quiz.getQuestion(i).getText()
		// 	 + " : " + quiz.getQuestion(i).commonSelectedOption());
		// }

	}
}



