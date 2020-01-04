package playable;

import javax.management.RuntimeErrorException;

import playable.some.AudioFile;
import playable.some.MediaFile;
import playable.some.Playable;
import playable.some.VideoFile;

/**
 * Concrete Factory creating Playables based on data.
 */
public class PlayableFactory {
    // SINGLETON
    private static PlayableFactory instance = new PlayableFactory();

    protected PlayableFactory() {
    }

    public static PlayableFactory getInstance() {
        return instance;
    }
    // END OF SINGLETON

    // Factory method
    public Playable makePlayable(String type, String filename, String genre) {
        switch (type) {
        case "media":
            return new MediaFile(filename);
        case "audio":
            return new AudioFile(genre, filename);
        case "video":
            return new VideoFile();
        default:
            throw new RuntimeException("Unknown type of Playable");
        }
    }
}
