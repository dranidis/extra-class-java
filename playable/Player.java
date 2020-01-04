package playable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import playable.some.Playable;

/**
 * Complete the definition of the Player class considering that a player has: a
 * list of strings representing the installed codecs, and a playlist of playable
 * objects.
 * 
 */
public class Player {

	List<String> installedCodecs = new ArrayList<>();
	List<Playable> playlist = new ArrayList<>();

	public void installDefaultCodecs() {
		String[] defaultCodecs = { "CODEC1", "CODEC2", "CODEC3", "CODEC4" };
		installedCodecs.addAll(Arrays.asList(defaultCodecs));
	}

	public void addToPlaylist(Playable object) {
		playlist.add(object);
	}

	public void installCodec(String codecName) {
		installedCodecs.add(codecName);
	}

	/**
	 * A method play that plays a playable file. Note that the player can play a
	 * playable file only if the codec of the playable is installed in the player.
	 * In the opposite case, your application should inform about the problem with
	 * the use of a CodecNotInstalledException
	 */

	public void play(Playable playable) throws CodecNotInstalledException {
		if (!installedCodecs.contains(playable.getCodec())) {
			// throw exception
			throw new CodecNotInstalledException(playable.getCodec());
		}
		playable.play();
	}

	/**
	 * A method playAll that plays the entire playlist. Note that if any of the
	 * playlist’s files are not supported by the player (its codec is not
	 * installed), an appropriate message should be output to the user
	 * 
	 * @throws CodecNotInstalledException
	 * 
	 */
	public void playAll() {
		// for all Playable objects in list playlist
		// call play
		// for(int i=0; i <= playlist.size(); ) {
		// playlist.get(i).play();
		// }
		System.out.println("**************** Player plays all...");
		for (Playable playable : playlist) {
			// playable.play();
			try {
				play(playable);
			} catch (CodecNotInstalledException e) {
				System.out.println(e.getMessage());
				install(e.getCodec());
			}
		}
		System.out.println("**************** Player finished.");
	}

	private void install(String codec) {
		System.out.println("Downloading from ....: " + codec);
	}

	// DO NOT MODIFY THE ABOVE METHOD
	// ADD YOUR CODE BELOW THIS LINE
	// ==============================

}
