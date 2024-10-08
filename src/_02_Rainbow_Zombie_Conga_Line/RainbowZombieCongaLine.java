package _02_Rainbow_Zombie_Conga_Line;

import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {
    
    /*
     * You are hosting a rainbow zombie conga dance party! Zombies are not very
     * smart(maybe that's why they crave brains) and need your help to direct
     * them through the choreography.
     * 
     * Each method is a dance move you will need to implement.
     * 
     * When you think you've gotten your zombies trained well enough you can
     * start the party by running the main method in RainbowZombieDanceParty and
     * typing how many rounds you want in the console to see if they followed
     * your choreography correctly.
     * 
     * Note: The party will always start with a rainbow brains and every 5
     * rounds the head and tail of the dance line will be removed.
     */

    private LinkedList<Zombie> congaLine;
    private ZombieHatColor[] zombieHats;
    ZombieHatColor zhc;
    Zombie zomb;
    LinkedList<Zombie> zom = new LinkedList<Zombie>();
     Node a;
        Node b;
    public RainbowZombieCongaLine() {

        congaLine = new LinkedList<Zombie>();
        zombieHats = ZombieHatColor.values();
     
   a = congaLine.getHead();

    }

    // Make the passed in zombie the first Zombie in the conga line!
    public void engine(Zombie dancer) {
    	addtofront(dancer);
    	a=congaLine.getHead();
    }
    
    // Make the passed in zombie the last Zombie in the conga line!
    public void caboose(Zombie dancer) {
    	
congaLine.add(dancer);
a = congaLine.getHead();
    }

    // Place the zombie at the designated position in the conga line!
    public void jumpInTheLine(Zombie dancer, int position) {
    	addtofront(dancer);
    	a=congaLine.getHead();
    	b=a;
    	for(int i=1; i< position-2; i++) {
    		b=b.getNext();
    	}
    	b.setValue(dancer);
congaLine.add(dancer);
    }

    /*
     * Remove all zombies with the same hat color as the passed in zombie from
     * the conga line!
     */
    public void everyoneOut(Zombie dancer) {
    	int count=0;
    	Node d=congaLine.getHead();
    	Node e=d.getNext();
    	
    	a=congaLine.getHead();
    	b=a;
zhc = dancer.getZombieHatColor();
Node head = congaLine.getHead();
for(int i=0; i<congaLine.size();i++) {
	Zombie c = (Zombie) b.getValue();
	if(c.getZombieHatColor().equals(zhc)) {
		System.out.println("++++++++\n++++++++"+zhc+c.getZombieHatColor()+"\n+++++++\n+++++\n+=++");
		
		congaLine.remove(i-count);
		count++;
		
	}
	b=b.getNext();
}
    }

    /*
     * Remove the first zombie with the same hat color as the passed in zombie
     * from the conga line!
     */
    public void youAreDone(Zombie dancer) {
    	System.out.println("\n");
    	b=congaLine.getHead();
zhc = dancer.getZombieHatColor();
boolean run = true;
for (int i = 0; i < congaLine.size(); i++) {
	if(run) {
		
		zomb=(Zombie) b.getValue();
		System.out.println(zhc +" <- zhc || zomb -> "+zomb.getZombieHatColor());
		if(zomb.getZombieHatColor()==zhc) {
			congaLine.remove(i);
			run=false;
		}
		b=b.getNext();
	}
}

    }

    /*
     * Make two more zombies with the same hat color as the passed in zombie and
     * add one to the front, one to the end and one in the middle.
     */
    public void brains(Zombie dancer) {
addtofront(dancer);
congaLine.add(dancer);
    }

    /*
     * Add the passed in zombie to the front and then add one zombie of each hat
     * color to the end of the line.
     */
    public void rainbowBrains(Zombie dancer) {
    	addtofront(dancer);
    	
    		
    	
	congaLine.add(new Zombie(zhc.R));
	congaLine.add(new Zombie(zhc.O));
	congaLine.add(new Zombie(zhc.Y));
	congaLine.add(new Zombie(zhc.G));
	congaLine.add(new Zombie(zhc.B));
	congaLine.add(new Zombie(zhc.I));
	congaLine.add(new Zombie(zhc.V));

    }

    public LinkedList<Zombie> getCongaLine() {
        return congaLine;
    }

   public void addtofront(Zombie dancer) {
	   b=congaLine.getHead();
   	congaLine.add(dancer);
   	for(int i=0;i<congaLine.size()-1;i++) {   	
   		congaLine.add(congaLine.getHead().getValue());
   		congaLine.remove(0);
   	}
   	 	
   	
   }

}
