package course.simuduck;

public class LouderQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("A Much louder quack!");
    }
}
