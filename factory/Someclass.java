package factory;

// this should not be changed!!!!!!

public final class Someclass {

    IFactory factory;

    public void setFactory(IFactory factory) {
        this.factory = factory;
    }

    // clients use this method!!!!!!
    public final void dosomething() {
        // if we want to change the server we DO NOT need change the file!!!
        // Server s =  new ConcreteServer(); // concrete creation!!!!!
        Server s =  factory.makeServer(); // factory method creation!!!!!
        s.dosmt();
    }
} 
