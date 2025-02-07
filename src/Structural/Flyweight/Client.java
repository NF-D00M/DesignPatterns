package Structural.Flyweight;


public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4056"));
//		SystemErrorMessage msg2 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.PageNotFoundError);
//		System.out.println(msg2.getText("4056"));
//		SystemErrorMessage msg3 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.ServerError);
//		System.out.println(msg3.getText("4056"));

		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
