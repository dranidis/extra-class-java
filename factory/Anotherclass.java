package factory;

public class Anotherclass extends Someclass {

    @Override
    protected Server makeServer() {
        return new ConcreteServerB();
    }
}