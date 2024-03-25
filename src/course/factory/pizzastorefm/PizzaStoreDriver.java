package course.factory.pizzastorefm;

public class PizzaStoreDriver {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("One order for " + pizza.getName());

		PizzaStore chicagoPizzStore = new ChicagoPizzaStore();
		pizza = chicagoPizzStore.orderPizza("veggie");
		System.out.println("One order for " + pizza.getName());

	}

}
