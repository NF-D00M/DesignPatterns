package Behavioural.Interpreter;

public class Client {

	public static void main(String[] args) {
		Report report1 = new Report("CashFlow Report", "FINANCE_ADMIN OR ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();

		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);

		User user1 = new User("Dave", "USER", "ADMIN");
		System.out.println("User access report: " + exp.interpret(user1));


	}

}
