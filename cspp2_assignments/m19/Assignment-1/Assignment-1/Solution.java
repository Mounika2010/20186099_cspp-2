import java.util.Scanner;
import java.util.ArrayList;


class Quiz {
	String questions;
	String[] choices;
	String answer;
	String marks;
	String penalty;

	Quiz() {

	}

	Quiz(String questions, String[] choices,
		String answer, String marks, String penalty) {
		this.questions = questions;
		this.choices = choices;
		this.answer = answer;
		this.marks = marks;
		this.penalty = penalty;
	}






}
/**
 * Solution class for code-eval.
 */
public final class Solution {
	static ArrayList<Quiz> quizz = new ArrayList<Quiz>();
	static ArrayList<String> ans = new ArrayList<String>();
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }

    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
                while (s.hasNext()) {
            // read the line
            //System.out.println("LOAD_QUESTIONS 4");
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
	public static void loadQuestions(final Scanner s, final Quiz quiz, int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        while (questionCount > 0) {
        	String lines = s.nextLine();
        	String[] tokens = lines.split(":");
        	String[] choices = tokens[1].split(",");
        	Quiz q = new Quiz(tokens[0],choices,tokens[2],tokens[3],tokens[4]);
        	quizz.add(q);
        	questionCount--;
 		}
 		if (quizz.size() != 0) {
 			System.out.println(quizz.size() + "Invalid max marks for question about sony");
 		}
        
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}

