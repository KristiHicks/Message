//Lab6.java
//Name: Kristi Hicks, hicksk2
public class Lab6 {
	public static void main(String[] args){
		Mailbox box = new Mailbox(); // empty mailbox
	    
	    Message msg = new Message("Harry Morgan", "Rudolf Reindeer");
	    msg.append("Hello, how are you?");
	    msg.append("Are you working on the assignment yet?");
	    msg.append("If so, can we meet this weekend to discuss the assignment?");
	    msg.append("Thanks for the help");
	    box.addMessage(msg);
	    
	    msg = new Message("Harry Morgan", "Stella Clause");
	    msg.append("It's getting closer to the holidays");
	    msg.append("Want to do some shopping next weekend?");
	    msg.append("Let me know");
	    box.addMessage(msg);
	    
	    msg = new Message("Harry Morgan", "Esther Bunny");
	    msg.append("I'm out of eggs, and the stores are closed");
	    msg.append("Do you have any I can borrow?");
	    msg.append("Thanks a lot!");
	    box.addMessage(msg);
	    
	    int m = box.getNumberofMessages();
	    for (int count=1; count<=m; count++)
	    {
	        Message M = box.getMessage(count);
	        System.out.println(M.toString());
	    }
	    
	    box.removeMessage(2); // remove second message added
	    
	    m = box.getNumberofMessages();
	    for (int count=1; count<=m; count++)
	    {
	        Message M = box.getMessage(count);
	        System.out.println(M.toString());
	    }
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