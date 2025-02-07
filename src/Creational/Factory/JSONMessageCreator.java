package Creational.Factory;


import Creational.Factory.message.JSONMessage;
import Creational.Factory.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
