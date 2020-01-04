package factory;

public class Main {
    public static void main(String[] args) {
        Someclass sc = new Someclass();

        sc.dosomething();
        // ConcreteServer: Doing smt!
        sc = new Anotherclass();

        sc.dosomething();

        // change this:
        // ConcreteServerB: Doing smt!
    }
}