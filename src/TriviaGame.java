import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TriviaGame
{
    public static void main(String[] args)
    {
        int numofQues = enterNumberOfQuestions();

        ArrayList<String> Questions = question(numofQues);

    }


        // method asking for number of questions

        public static int enterNumberOfQuestions() {

            String numberOfQuestionsInSet = JOptionPane.showInputDialog("Please enter the number of questions you want to ask (under 10)");
            int numberOfQuestions = Integer.parseInt(numberOfQuestionsInSet);
            return numberOfQuestions;



        }


        // method asking for user to enter question and answer to question


    // make Questions Do/While loop on a countdown
    public static ArrayList<String> question(int a) {


                    ArrayList<String> questions = new ArrayList<String>();
                    do {

                        String Question = JOptionPane.showInputDialog("Please enter a question");
                        questions.add(Question);
                    } while (a > 0 && a <= 10);

                    return  questions;

    }




    }




