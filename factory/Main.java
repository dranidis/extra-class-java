package factory;

public class Main {
    public static void main(String[] args) {
        Someclass sc = new Someclass();
        sc.setFactory(new Factory());

        sc.dosomething();
        // ConcreteServer: Doing smt!
        sc.setFactory(new FactoryB());

        sc.dosomething();

        // change this:
        // ConcreteServerB: Doing smt!
    }
}