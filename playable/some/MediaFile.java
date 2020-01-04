package playable.some;

public class MediaFile implements Playable {

    // attributes
    // object variables
    //
    // private attributes
    // encapsulate the state of the objects

    // interface Playable
    // play()
    // getCodec()

    // interface of Mediafile / set of methods offered by Mediafile
    // play()
    // getCodec()
    // getDuration()
    // private methods are not offered

    //
    // Mediafile set of methods is a superset of Playable set of methods
    // Playable set of methods is a subset of Mediafile set of methods
    //
    // Mediafile is a subtype of Playable
    // Playable is a supertype of Mediafile
    //

    private String filename;
    // private String codec;
    private Codec codec;
    private int duration;

    public MediaFile() { // define an implicit constructor
    }

    public MediaFile(String filename, Codec codec, int duration) {
        System.out.println("This: " + this);
        System.out.println("Duration:" + this.duration);
        System.out.println("Codec: " + this.codec);
        System.out.println("filename: " + this.filename);

        this.filename = filename;
        this.codec = codec;
        this.duration = duration;

        System.out.println("This: " + this);
        System.out.println("Duration:" + this.duration);
        System.out.println("Codec: " + this.codec);
        System.out.println("filename: " + this.filename);

        System.out.println(this.getCodec());
        // assignment x = y;
        // // "this" is the variable name to the current object of class Mediafile
    }

    @Override
    public void play() {
        // String filename = "Some file name"; // local variable
        System.out.println("Now playing " + this.filename);
        // System.out.println("Now playing " + filename);
    }

    @Override
    public String getCodec() {
        return codec.getCodecName();
    }

    public int getDuration() {
        return duration;
    }

    private void stop() {

    }

}