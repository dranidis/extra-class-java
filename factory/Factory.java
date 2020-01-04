package factory;

public class Factory implements IFactory {
    // factory method
    public Server makeServer() {
        return new ConcreteServer();
    }
}
