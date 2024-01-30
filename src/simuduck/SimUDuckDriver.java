package simuduck;

public class SimUDuckDriver {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("Change fly behavior for the model duck");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("Using a duck call");
        DuckCall duckCall = new DuckCall();
        duckCall.performQuack();
        System.out.println("Changing the call cquacking");
        duckCall.setQuackBehavior(new LouderQuack());
        duckCall.performQuack();
    }
}
