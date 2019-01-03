import java.util.Scanner;
class Question {
    String question;
    int maxMarks;
    String[] choices;
    int correctAns;
    int penalty;
    String response;

    Question(String questionss, int marks, String[] choices, int correctres, int wrong, String response1) {
        this.question = questionss;
        this.maxMarks = marks;
        this.choices = choices;
        this.correctAns = correctres;
        this.penalty = wrong;
        this.response = response1;
    }

    public boolean correctAnswer(String choice) {
        for (int i = 0; i < choices.length; i++){

            if (choice.equals(choices[correctAns])) {
                return true;
            }

        
        }
        return false;
    }

    public String getQuestionText() {
        return question;
    }

    public int getMaxmarks() {
        return maxMarks;
    }

    public int getPenalty() {
        return penalty;
    }

    public String getResponse() {
        return response;
    }

    public String getChoices() {
        return choices;
    }


}






class Quiz {
    int size;
    Question[] questions;

    Quiz() {
        size = 0;
        questions = new Question[10];
    
    }

    public int size() {
        return size;
    }

    public int addAQuestion(Question ques) {
        for (int i = 0; i < questions.length; i++) {
            if (questions[i] == null) {
                questions[i] = ques;
                size++;
                return i;
            }
        }
        return -1;
    }

    public Question getQuestion(int i) {
        return questions[i];

    } 

}


public final class Solution {
    /**
     * { var_description }.
     */
    private static final int FIVE = 5;
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
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                try {
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
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


    public static void loadQuestions(Scanner s, Quiz q, int i) {
        if (q == 0) {
            System.out.println("Quiz does not have questions");
            return;
        }

        for (i = 0; i < questions.length; i++) {
            q.getQuestion();
        }


    }

    public static void startQuiz(Scanner s, Quiz q, int i) {

    }

    public static void displayScore(Quiz q) {

    }

}