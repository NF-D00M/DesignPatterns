package Behavioural.Command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();

		Command c1 = new AddMemberCommand("jack.a.gale@gmail.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("haylee@gmail.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);

		Thread.sleep(10000);
		MailTasksRunner.getInstance().shutdown();
	}

}
