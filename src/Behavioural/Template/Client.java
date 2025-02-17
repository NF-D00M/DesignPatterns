package Behavioural.Template;

import org.w3c.dom.Text;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");
		order.addItem("Soda", 2.50);
		order.addItem("Sandy", 11.95);
		order.addItem("Pizza" , 15.00);

		OrderPrinter printer = new HtmlPrinter();
		printer.printOrder(order, "1000.xt");
	}
}
