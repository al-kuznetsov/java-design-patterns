package course.starbuzz;

import course.starbuzz.Beverage.Size;

public class StarbuzzDriver {

	public static void main(String[] args) {
		Beverage beverage1 = new DarkRoast();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);

		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

		Beverage beverage2 = new Espresso();
		beverage2.setSize(Size.GRANDE);
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}

}
