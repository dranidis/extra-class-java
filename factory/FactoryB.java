package factory;

public class FactoryB implements IFactory {
    //factory method
    @Override
    public Server makeServer() {
        return new ConcreteServerB();
    }
}
