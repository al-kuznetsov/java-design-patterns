package factory.pizzastoresf;

public class PizzaStoreDriver {
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore(new SimplePizzaFactory());

		store.orderPizza("cheese");
		
		System.out.println("=== Trying Russian Pizza Store ===");
		PizzaStore russianStore = new PizzaStore(new RussianPizzaFactory());
		
		russianStore.orderPizza("сыр");
	}
}
