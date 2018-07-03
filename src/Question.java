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
public interface Question {
    
    public String getQuestion();
    public ArrayList<String> getAnswers();
    public boolean isMultipleChoice();
    public boolean isSingleAnswer();
    
    
}
