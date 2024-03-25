package course.singleton.chocolateenum;

public class ChocolateController {
	public static void main(String args[]) {
//		System.out.println("=== Regular single-thread demo ===");
//		ChocolateBoiler sboiler = ChocolateBoiler.getInstance();
//		sboiler.fill();
//		sboiler.boil();
//		sboiler.drain();
//
//		ChocolateBoiler sboiler2 = ChocolateBoiler.getInstance();
//		sboiler2.fill();
//		sboiler2.boil();
//		sboiler2.drain();

		System.out.println("=== Multi-thread collision demo ===");
		Thread thread1 = new Thread(() -> {
			ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;
			boiler.fill();
			boiler.boil();
			boiler.drain();
		});

		Thread thread2 = new Thread(() -> {
			ChocolateBoiler boiler2 = ChocolateBoiler.UNIQUE_INSTANCE;
			boiler2.fill();
			boiler2.boil();
			boiler2.drain();
		});

		thread1.start();
		thread2.start();
	}
}
