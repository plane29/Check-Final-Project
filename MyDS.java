import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.io.IOException;


//we took a lot of this code from the data structures lab.  We did, however, put in some methods that allow us to check if puzzles are solved correctly

public class MyDS implements OrderedCollection{
	Node end; // some end node
	public MyDS(){  // declaration of ds sets end node to null
		end = null;
	}	

	
class Node{ //class node as seen in lab and in class
	int num;
	Node next;
	public Node(int num){
		this.num = num;
	}
}


  	public boolean checkPiano(){ //check piano checks to see if the user played the keys correctly
		String toReturn = "";  //creates a new string to check
		Node n = end;  //
		int nodepos = 0;  //keeps track of node position
		while (nodepos < 7 && (n!=null)){ //loops until node position is 7 nodes in and we have not reached end
			toReturn = n.num + " " + toReturn;  //adds the node num to the string
			n = n.next;  //moves to next node
			nodepos = nodepos + 1;  //increases node posititon
		}

		if(toReturn.equals("1 2 3 4 5 6 7 ")) { //checks to see if the piano was played in correct order 
			return true;  //if it was return true if it wasn't return false
		}
		else{ return false;
		}

    }

    //method to check to see if the user gets the riddle correct
   	public boolean checkRiddle(){ //same thing as above for the riddle but the word candle is only 6 letters, so one node fewer
		String toReturn = "";
		Node n = end;
		int nodepos = 0;
		while (nodepos < 6 && (n!=null)){
			toReturn = n.num + " " + toReturn;
			n = n.next;
			nodepos = nodepos + 1;
		}

		if(toReturn.equals("1 2 3 4 5 6 ")) {
			return true;
		}
		else{ return false;
		}

    }



    public void append(int toAppend){ //appends a node to the end of our linked list
		Node toAdd = new Node(toAppend);
		toAdd.next = end;
		end = toAdd;

    }

    public int peek(){  //returns the end of our data structure
    	return end.num;
    }

    public int pop(){  //pops off the end node
    	int toReturn = end.num;
		end = end.next;
		return toReturn;
    }

    public String toString(){  //converts our node to a string
		String toReturn = "";
		Node n = end;
		while (n != null){
			toReturn = n.num + " " + toReturn;
			n = n.next;
		}
		return toReturn;
    }

    public int length(){ //gets the length of our data structure
    	int toReturn = 0;
    	Node n = end;
    	while (n != null){
    		toReturn = toReturn + 1;
    		n = n.next;
    	}

    	return toReturn;

    }
}