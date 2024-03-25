package course.starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch (beverage.getSize()) {
		case Size.TALL:
			cost += .10;
			break;
		case Size.GRANDE:
			cost += .15;
			break;
		case Size.VENTI:
			cost += .20;
			break;
		default:
			throw new IllegalStateException("Wrong Beverage Size!");
		}
		return cost;
	}
}
