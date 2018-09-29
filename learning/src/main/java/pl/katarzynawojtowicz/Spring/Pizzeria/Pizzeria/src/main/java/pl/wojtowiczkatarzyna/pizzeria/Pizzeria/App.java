package pl.wojtowiczkatarzyna.pizzeria.Pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		IOrder order = context.getBean(Order.class);
		order.printOrder();
		context.close();
	}
}
