package simuduck;

public class DuckCall extends Call {
    public DuckCall() {
        this.quackBehavior = new Quack();
    }
}
