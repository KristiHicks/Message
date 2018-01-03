//Mailbox.java
//Name: Kristi Hicks, hicksk2
import java.util.ArrayList;

public class Mailbox extends Lab6{
	private final ArrayList <Message> List;
	int number;
	
	public Mailbox(){
		this.List = new ArrayList<>();
	}

	public void addMessage(Message m){
		List.add(m);
		number++;
	}
	
	public int getNumberofMessages(){
		return number;
	}
	
	public Message getMessage(int position){
		return List.get(position-1);
	}
	
	public void removeMessage(int position){
		List.remove(position-1);
		number--;
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 6
*
* Description:
*	This program models an email message. It takes in a recipient and a sender and a message text.
*	It then sets the sender and recipient and takes in a line of the text and adds it to the message.
*	It's then displayed to the user. It also can remove a message line from the message text.
*   
* Bug Report:
*   None.
*/