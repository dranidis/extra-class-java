package template;

public class Someclass {

    // template method
    protected void doStart() {
        System.out.println("Do start");
    }

    // template method
    protected void doEnd() {
        System.out.println("Do end");
    }
    
    public final void doSmt() {
        doStart(); // change this. concrete things
        System.out.println("THIS ALWAYS HAPPENS");
        doEnd(); // change this. concrete things
    }
}