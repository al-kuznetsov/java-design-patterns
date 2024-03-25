package course.factory.pizzastoresf;

public class RussianPizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "сыр":
			return new CheesePizza();
		case "пепперони":
			return new PepperoniPizza();
		case "вегетарианская":
			return new VeggiePizza();
		case "мидии":
			return new ClamPizza();
		default:
			throw new IllegalStateException("Unknown type of Pizza");
		}
	}

}
