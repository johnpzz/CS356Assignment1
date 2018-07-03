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
public class SingleChoiceQuestion implements Question {
    
    private String question;
    private ArrayList<String> answers;
    
    SingleChoiceQuestion() {
        
    }
    
    SingleChoiceQuestion(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }
    
    
    @Override
    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    @Override
    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String response) {
        question = response;
    }


    @Override
    public boolean isMultipleChoice() {
        return false;
    }

    @Override
    public boolean isSingleAnswer() {
        return true;    
    }
    
}
