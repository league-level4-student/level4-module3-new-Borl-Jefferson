package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
      ArrayList<String> suspectsv2 = new ArrayList<String>();
		ArrayList<String> suspects = new ArrayList<String>();
//		System.out.println("test");
		Node head = train.getHead();
		TrainCar ab = (TrainCar) head.getValue();
		System.out.println(ab.questionPassenger());
		Node ad = train.getHead();
		Node ac;
		for (int i = 0; i < train.size() - 1; i++) {
			ac = ad.getNext();
			TrainCar bc = (TrainCar) ac.getValue();
			System.out.println(bc.questionPassenger());

			for (int j = 0; j < clues.length; j++) {
				if (bc.questionPassenger().contains(clues[j])) {
					suspects.add(bc.questionPassenger());
				}
			}

			ad = ac;
		}
		for (int u = 0; u < suspects.size(); u++) {
			int st = suspects.get(u).indexOf("saw");
			String goodies = suspects.get(u).substring(st + 4);
			String goodiesv2 = goodies.subSequence(0, goodies.indexOf(" ")).toString();
			System.out.println(goodiesv2);
			suspectsv2.add(goodiesv2);
		}
		int counter;
		for (int h = 0; h < suspectsv2.size(); h++) {
			counter = 0;
			for (int g = 0; g < suspectsv2.size(); g++)
				if (suspectsv2.get(h).equals(suspectsv2.get(g))) {
					counter++;
				}
			if (counter == 3) {
				return suspectsv2.get(h);
			}
		}
		return "";
	}
}
