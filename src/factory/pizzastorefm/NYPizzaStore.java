package factory.pizzastorefm;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new NYStyleCheesePizza();
		case "pepperoni":
			return new NYStylePepperoniPizza();
		case "veggie":
			return new NYStyleVeggiePizza();
		default:
			throw new IllegalStateException("Unknown pizza type!");
		}
	}

}
