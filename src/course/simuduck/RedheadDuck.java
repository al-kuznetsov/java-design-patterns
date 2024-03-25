package course.simuduck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a redhead duck");
    }
}
