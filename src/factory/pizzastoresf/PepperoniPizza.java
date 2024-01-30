package factory.pizzastoresf;

public class PepperoniPizza implements Pizza {
	private final static String TYPE = "Pepperoni";

	@Override
	public void prepare() {
		System.out.println("Prepare " + TYPE);
	}

	@Override
	public void bake() {
		System.out.println("Bake " + TYPE);

	}

	@Override
	public void cut() {
		System.out.println("Cut " + TYPE);
	}

	@Override
	public void box() {
		System.out.println("Box " + TYPE);
	}
}