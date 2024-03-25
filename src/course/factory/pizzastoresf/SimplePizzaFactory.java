package course.factory.pizzastoresf;

public class SimplePizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new CheesePizza();
		case "pepperoni":
			return new PepperoniPizza();
		case "veggie":
			return new VeggiePizza();
		case "clam":
			return new ClamPizza();
		default:
			throw new IllegalStateException("Unknown type of Pizza");
		}
	}

}
