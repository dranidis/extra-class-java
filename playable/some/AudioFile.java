package playable.some;

/**
 * Define the class AudioFile according to the UML class diagram. The class must
 * include the depicted attributes and a constructor with parameters for the
 * initialisation of all attributes. Note that when an audio file is played, its
 * filename and genre are displayed on the screen.
 * 
 * genre: String
 */
public class AudioFile extends MediaFile {
    private String genre;

    public AudioFile() {

    }

    public AudioFile(String genre) {
        super("Some", new Codec("SSSS"), 0);
        this.genre = genre;
    }

    public AudioFile(String genre, String filename, Codec codec, int duration) {
        super(filename, codec, duration);
        this.genre = genre;
    }

    public AudioFile(String genre, String filename) {
        super(filename);
        this.genre = genre;
	}

	@Override
    public void play() {
        // this.genre = "changed";
        // Mediafile object, object of the superclass.
        // calling a method of super class
        super.play();
        // this.play(); // infinite recursion
        // play(); // this.play() 
        // System.out.println("Now playing " + filename);
        System.out.println("Genre of audio file: "  + genre);
    }

}