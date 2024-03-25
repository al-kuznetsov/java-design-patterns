package course.simuduck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a wild duck");
    }

}
