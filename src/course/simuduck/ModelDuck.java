package course.simuduck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a decoy duck!");
    }
}
