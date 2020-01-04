package playable;

import playable.some.AudioFile;
import playable.some.MediaFile;
import playable.some.Playable;

public class ExtraPlayableFactory extends PlayableFactory {
    // SINGLETON
    private static ExtraPlayableFactory instance = new ExtraPlayableFactory();

    protected ExtraPlayableFactory() {
    }

    public static ExtraPlayableFactory getInstance() {
        return instance;
    }
    // END OF SINGLETON

    @Override
    public Playable makePlayable(String type, String filename, String genre) {
        switch (type) {
        case "media":
            System.out.println("Media file detected");
            return new MediaFile(filename);
        case "audio":
            System.out.println("AudioFile file detected");
            return new AudioFile(genre, filename);
        default:
            throw new RuntimeException("Unknown type of Playable");
        }
    }
}
