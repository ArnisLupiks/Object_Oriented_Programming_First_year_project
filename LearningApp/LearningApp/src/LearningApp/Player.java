/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningApp;

/**
 *
 * @author Barry mc Gettigan
 */
public class Player {
    private String firstName;
    private String lastName;
    private int score;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public int calculateStanding(){
        return 0;
    }
}
