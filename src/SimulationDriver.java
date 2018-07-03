/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class SimulationDriver {
    
    public static void main(String[] args) {
        String multipleChoice;
        String singleChoice;
        
        multipleChoice = "What are some of your favorite animals?";
        singleChoice = "Are you a happy person?";
        
        ArrayList<String> multipleChoiceQuestionAnswers = new ArrayList<>();
        multipleChoiceQuestionAnswers.add("Foxes");
        multipleChoiceQuestionAnswers.add("Elephants");
        multipleChoiceQuestionAnswers.add("Cats");
        multipleChoiceQuestionAnswers.add("Dogs");
        multipleChoiceQuestionAnswers.add("Dolphins");
        
                
        ArrayList<String> singleChoiceQuestionAnswers = new ArrayList<>();
        singleChoiceQuestionAnswers.add("Yes, I am!");
        singleChoiceQuestionAnswers.add("No, I am not.");
        
        
        Question multipleChoiceQuestion = new MultipleChoiceQuestion(multipleChoice, multipleChoiceQuestionAnswers);
        Question singleChoiceQuestion = new SingleChoiceQuestion(singleChoice, singleChoiceQuestionAnswers);
        
        Question[] questionTypeArray = new Question[2];
        questionTypeArray[0] = multipleChoiceQuestion;
        questionTypeArray[1] = singleChoiceQuestion;
                     
        
        System.out.print("Enter a question type..\n(1): Multiple Choice Question\n(2): Single Choice Question\nType: ");
        Scanner keyboard = new Scanner(System.in);
        int inputChoice = keyboard.nextInt();
        Question questionChoice = questionTypeArray[inputChoice-1];
        
        System.out.println("How many students do you want to simulate getting asked this question?");
        int numStudentsChoice = keyboard.nextInt();
        Student[] studentArray = new Student[numStudentsChoice];
        
        for (int i = 0; i < numStudentsChoice; i++) {
            studentArray[i] = new Student(i);
        }
        
        System.out.println("Question:\t" + questionChoice.getQuestion());
        
        System.out.println("Student results:");
                
        for (int i = 0; i < numStudentsChoice; i++) {
            studentArray[i].submitAnswer(questionChoice);
            System.out.println("Student " + studentArray[i].getUniqueID() + " answered " + studentArray[i].getAnswer());
        }
        
        iVoteService iVote = new iVoteService(questionChoice, questionChoice.getAnswers());
        System.out.println("Results of iVote:");
        iVote.displayRun();
      



    }
    
}
