/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author John
 */
public class Student {
    
    private int uniqueID;
    private ArrayList<String> answer;
    private static Map<Integer, ArrayList<String>> responseMap = new HashMap<>();

    
    Student() {
        
    }
    
    Student(int id)
    {
        this.uniqueID = id;
    }
    
    public static Map<Integer, ArrayList<String>> getStudentMap() {
        return responseMap;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }
    
    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }
    
    //We want to submit a random answer or response to a given question.
    public void submitAnswer(Question question) {
                
        //Question is multiple choice, we can take many answers from the list randomly and put them uniquely in our map.
        if (question.isMultipleChoice()) {
            answer = new ArrayList<String>(question.getAnswers());
            Collections.shuffle(answer);

            int randomNum = new Random().nextInt(answer.size()-1);
            
            for (int i = 0; i < randomNum; i++) {
                answer.remove(i);
            }
            
            for (int i = 0; i < answer.size(); i++) {
                if (answer.get(i) != null) {
                    responseMap.put(getUniqueID(), answer);
                }
            }
            
            
            setAnswer(answer);

            
         //Else, the question is not multiple choice and it only has two answers to it.
        } else {
            answer = new ArrayList<String>(question.getAnswers());
            Collections.shuffle(answer);
            answer.remove(0);
            responseMap.put(getUniqueID(), answer);
            
            
            setAnswer(answer);
            
        }
        
        Collections.sort(answer);           // or else the answers will not print in alphabetical order for each Student
    }
    
    
}
