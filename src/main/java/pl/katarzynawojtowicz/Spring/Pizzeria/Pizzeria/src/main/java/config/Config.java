package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.wojtowiczkatarzyna.pizzeria.Pizzeria.ExoticPizza;
import pl.wojtowiczkatarzyna.pizzeria.Pizzeria.IOrder;
import pl.wojtowiczkatarzyna.pizzeria.Pizzeria.IPizza;
import pl.wojtowiczkatarzyna.pizzeria.Pizzeria.Order;

@Configuration
public class Config {
	@Bean
	public IPizza pizza() {
		return new ExoticPizza(18, "Egzotyczna");
	}

	@Bean(name = "inna")
	public IOrder order(IPizza pizza) {
		return new Order(pizza);
	}
}
