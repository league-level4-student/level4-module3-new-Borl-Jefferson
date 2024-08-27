package _01_Spies_On_A_Train;

import java.util.HashMap;
import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	System.out.println("test");
Node head = train.getHead();
TrainCar ab = (TrainCar) head.getValue();
System.out.println(ab.questionPassenger());
Node ad=train.getHead();
Node ac;
for(int i=0;i<train.size()-1;i++) {
	ac = ad.getNext();
	TrainCar bc = (TrainCar) ac.getValue();
	System.out.println(bc.questionPassenger());
	ad=ac;
}
        return "";

    }

}
