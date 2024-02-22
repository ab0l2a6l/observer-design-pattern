package example;


public class Main {
    public static void main(String[] args) {
        Celebrity celebrity1 = new Celebrity("celebrity1");
        Celebrity celebrity2 = new Celebrity("celebrity2");

        ConcreteClassA follower1 = new ConcreteClassA("follower1");
        ConcreteClassA follower2 = new ConcreteClassA("follower2");
        ConcreteClassB follower3 = new ConcreteClassB("follower3");

        celebrity1.addObserver(follower1);
        celebrity1.addObserver(follower2);

        celebrity2.addObserver(follower3);

        celebrity1.tweet("first tweet");
        System.out.println();
        celebrity2.tweet("first tweet");

        System.out.println("----------------------------");

        celebrity1.deleteObserver(follower1);

        celebrity2.addObserver(follower1);
        celebrity2.addObserver(follower2);

        celebrity1.tweet("second tweet");
        System.out.println();
        celebrity2.tweet("second tweet");
     }
}