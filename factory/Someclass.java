package factory;

// this should not be changed!!!!!!

public class Someclass {
    
    protected Server makeServer() {
        return new ConcreteServer();
    }

    // clients use this method!!!!!!
    public final void dosomething() {
        // if we want to change the server we DO NOT need change the file!!!
        // Server s =  new ConcreteServer(); // concrete creation!!!!!
        Server s =  makeServer(); // factory method creation!!!!!
        s.dosmt();
    }
} 
