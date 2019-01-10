import java.util.Scanner;
import java.util.Arrays;

class Question{

	String questions;
	String[] options;
	int[] noOfQues;

	Question(String questions, String[] options) {
		this.questions = questions;
		this.options = options;
		// System.out.println(questionss);
		// System.out.println(Arrays.toString(options));
		noOfQues = new int[4];

	}

	public String getText() {
		return questions;
	}


	public void setOptionVotes(int votes) {
		noOfQues[votes] = noOfQues[votes] + 1;

	}

	public int indexOf(String options){
		for (int i = 0; i < 4; i++) {
			if (this.










				options[i].equals(options)) {
				return i;
			}
		}

		return 0;
	}

	public String commonSelectedOption() {
		int max = 0;
		int key = 0;
		for (int i = 0; i< 4; i++) {
			if (noOfQues[i] > max) {
				max = noOfQues[i];
				key = i;
			}
		}
		return options[key];
	}

}

class Quiz{
	Question[] questions;
	int size;

	Quiz() {
		size = 0;
		questions = new Question[10];

	}

	public void addQuestion(Question q) {
		questions[size++] = q;
		// System.out.println(size);

	}

	public Question getQuestion(int i) {
		return questions[i];
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
				question.setOptionVotes(question.indexOf(lines[1]));
			}
		}

		for (int i = 0; i < questions; i++) {
			System.out.println("Highest number of votes for question : "+ quiz.getQuestion(i).getText()
			 + " : " + quiz.getQuestion(i).commonSelectedOption());
		}

	}
}



