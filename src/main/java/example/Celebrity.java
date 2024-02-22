package example;

import java.util.Observable;

public class Celebrity extends Observable {

    private String  name;
    private String message;

    public Celebrity(String name) {
        this.name = name;

    }

    public void tweet(String message) {
        System.out.println(name + " said " + message);
        this.message = message;
        setChanged();
        notifyObservers(message);
    }

    public String getName() {
        return name;
    }

    public Celebrity setName(String name) {
        this.name = name;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Celebrity setMessage(String message) {
        this.message = message;
        return this;
    }
}
