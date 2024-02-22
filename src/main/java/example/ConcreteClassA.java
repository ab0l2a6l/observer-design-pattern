package example;

import java.util.Observable;
import java.util.Observer;

public class ConcreteClassA implements Observer {

    private String name;

    public ConcreteClassA(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        Celebrity celebrity = (Celebrity) o;
        String message = String.format("%s received %s from %s", name, arg.toString(), celebrity.getName());
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public ConcreteClassA setName(String name) {
        this.name = name;
        return this;
    }
}
