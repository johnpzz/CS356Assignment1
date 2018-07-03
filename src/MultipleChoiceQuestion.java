/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class MultipleChoiceQuestion implements Question {
    
    
    private String question;
    private ArrayList<String> answers;
    
    MultipleChoiceQuestion() {
        
    }
    
    MultipleChoiceQuestion(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }
    

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public ArrayList<String> getAnswers() {
        return answers;
    }

    @Override
    public boolean isMultipleChoice() {
        return true;
    }

    @Override
    public boolean isSingleAnswer() {
        return false;
    }
    
    

   
    
}
