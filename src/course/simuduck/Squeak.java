package course.simuduck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am squeaking!");
    }
}
