package Creational.Factory;

import Creational.Factory.message.Message;
import org.w3c.dom.Text;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());


		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
