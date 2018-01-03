//Message.java
//Name: Kristi Hicks, hicksk2

public class Message extends Lab6{
	private String recipient;
	private String sender;
	private String text;
	
	public Message(String reciever, String sent){
		recipient = reciever;
		sender = sent;
		text = "";
	}
	
	public void append(String message){
		text += message + "\n";
		
	}
	
	public String toString(){
		System.out.println("From: " + recipient);
		System.out.println("To: " + sender);
		System.out.println("");
		return text;
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
