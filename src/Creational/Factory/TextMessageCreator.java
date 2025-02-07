package Creational.Factory;


import Creational.Factory.message.Message;
import Creational.Factory.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
