package Creational.Factory.message;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

	public abstract String getContent();
	
	public void addDefaultHeaders() {
		//Adds some default headers
	}
	
	public void encrypt() {
		System.out.println("encrypted");
	}
	
}
