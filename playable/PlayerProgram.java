package playable;

import playable.some.AudioFile;
import playable.some.Codec;
import playable.some.MediaFile;
import playable.some.Playable;

public class PlayerProgram {

    public static void main(String[] args) {
        Player player = new Player(ExtraPlayableFactory.getInstance());
        player.installDefaultCodecs();


        player.addToPlaylist("audio", "file.mp4", "Rock");
        player.addToPlaylist("audio", "music.mp4", "Jazz");
        player.addToPlaylist("media", "file.ogg", "");
        player.addToPlaylist("media", "ringtone.au", "");
        player.addToPlaylist("video", "StarWars.avi", "SciFi");
        // player.addToPlaylist("video", "file.avi", "");

        player.playAll();




    }
}

/*
 * Now playing: Dirty Diana Genre of audio file: Rock Cannot play file. Codec:
 * SomeCodec is not installed Now playing: Hallelujah Genre of audio file: Rock
 * Now playing: ringtone
 */