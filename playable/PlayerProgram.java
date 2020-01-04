package playable;

import playable.some.AudioFile;
import playable.some.Codec;
import playable.some.MediaFile;
import playable.some.Playable;

public class PlayerProgram {

    public static void main(String[] args) {
        Player player = new Player();
        player.installDefaultCodecs();

        // Playable song1 = new AudioFile("Dirty Diana", "CODEC1", "Rock");
        // Playable song2 = new AudioFile("Sad but True", "SomeCodec", "Heavy Metal");
        // Playable song3 = new AudioFile("Hallelujah", "CODEC2", "Rock");

        // Playable song4 = new MediaFile("ringtone", "CODEC4");

        // ADD YOUR CODE BELOW THIS LINE
        // =============================

        // Add the songs to the player's list

        // Play all playerlist songs

        // variable x of type int, with value 3
        // int x = 3;

        // variable song1 of type MediaFile, with value a new object of class MediaFile
        // MediaFile song1 = new MediaFile(); // default constructor is not available
        MediaFile song1 = new MediaFile("file.mp4", new Codec("COEC"), 3);

        song1.play();
        System.out.println(song1.getCodec());
        System.out.println(song1.getDuration());

        // variable song2 of type Playable, with value a new object of class MediaFile
        // Playable song2 = new MediaFile();

        // variable song3 of type Playable, with value the object referenced by song1
        Playable song3 = song1;
        song3.play();
        System.out.println(song3.getCodec());
        // System.out.println(song3.getDuration());

        // Playable song4 = new AudioFile("Rock");
        // AudioFile is a subtype of Mediafile
        MediaFile song4 = new AudioFile("Rock");
        // System.out.println(song4.filename);
        song4.play();
        System.out.println(song4.getCodec());
        System.out.println(song4.getDuration());

        // AudioFile af = new AudioFile();
        Playable af1 = new AudioFile("Rock", "f.mp4", new Codec("CC"), 4);

        af1.play();

        Player player2 = new Player();

        player2.addToPlaylist(song3);
        player2.addToPlaylist(song4);
        player2.addToPlaylist(af1);

        // player2.addToPlaylist();

        player2.installCodec("NEW CODEC");

        System.out.println("*******************Playing file f.mp4");
        player2.playMedia("f.mp4");

        // try {
        player2.playAll();
        // } catch (CodecNotInstalledException e) {
        // System.out.println(e.getMessage());
        // }

        // try {
        // player2.playAll();
        // } catch (CodecNotInstalledException e) {
        // System.out.println("Error! " + e.getMessage());
        // // e.printStackTrace();
        // }

        // System.out.println("After try");

    }
}

/*
 * Now playing: Dirty Diana Genre of audio file: Rock Cannot play file. Codec:
 * SomeCodec is not installed Now playing: Hallelujah Genre of audio file: Rock
 * Now playing: ringtone
 */