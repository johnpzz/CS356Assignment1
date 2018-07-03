/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author John
 */
public class iVoteService {
    
    private Question questionType;
    private ArrayList<String> answers;
     
    iVoteService() {
        
    }
    
    iVoteService(Question question, ArrayList<String> answers)
    {
        questionType = question;
        this.answers = answers;
        
    }
    
    public void displayRun() {
        System.out.println(Student.getStudentMap());
        if (questionType.isMultipleChoice()) {
            int Foxes = 0;
            int Elephants = 0;
            int Cats = 0;
            int Dogs = 0;
            int Dolphins = 0;
            
            for (int i = 0; i < Student.getStudentMap().size(); i++) {
                if (Student.getStudentMap().get(i).contains("Foxes")) {
                    Foxes++;
                }
                if (Student.getStudentMap().get(i).contains("Elephants")) {
                    Elephants++;
                }
                if (Student.getStudentMap().get(i).contains("Cats")) {
                    Cats++;
                }
                if (Student.getStudentMap().get(i).contains("Dogs")) {
                    Dogs++;
                }
                if (Student.getStudentMap().get(i).contains("Dolphins")) {
                    Dolphins++;
                }
            }
                    
                  
            System.out.println("Number of Foxes: " + Foxes);  
            System.out.println("Number of Elephants: " + Elephants); 
            System.out.println("Number of Cats: " + Cats); 
            System.out.println("Number of Dogs: " + Dogs); 
            System.out.println("Number of Dolphins: " + Dolphins); 
            
        } else {
            int Yes = 0;
            int No = 0;
            
            for (int i = 0; i < Student.getStudentMap().size(); i++) {
                if (Student.getStudentMap().get(i).contains("Yes, I am!")) {
                    Yes++;
                }
                if (Student.getStudentMap().get(i).contains("No, I am not.")) {
                    No++;
                }
            }
            
            System.out.println("Number of people who said Yes: " + Yes);
            System.out.println("Number of people who said No: " + No);           
        }
        
                
        
    }
    
    
    
}
