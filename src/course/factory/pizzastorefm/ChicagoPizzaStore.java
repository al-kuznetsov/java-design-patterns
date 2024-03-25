package course.factory.pizzastorefm;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new ChicagoStyleCheesePizza();
		case "pepperoni":
			return new ChicagoStylePepperoniPizza();
		case "veggie":
			return new ChicagoStyleVeggiePizza();
		default:
			throw new IllegalStateException("Unknown pizza type!");
		}
	}

}
