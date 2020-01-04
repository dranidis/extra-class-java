package playable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import playable.some.Playable;

/**
 * Complete the definition of the Player class considering that a player has: a
 * list of strings representing the installed codecs, and a playlist of playable
 * objects.
 * 
 */
public class Player {

	List<String> installedCodecs = new ArrayList<>();
	// List<Playable> playlist = new ArrayList<>();

	// Interface varName = new ClassName()
	// key -> value
	// "file1" -> playable1
	// "file2" -> playable2
	// "file3" -> playable3
	//
	Map<String, Playable> playlist = new HashMap<>();

	public void installDefaultCodecs() {
		String[] defaultCodecs = { "CODEC1", "CODEC2", "CODEC3", "CODEC4" };
		installedCodecs.addAll(Arrays.asList(defaultCodecs));
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

		System.out.println("**************** Player plays all...");

		Set<Entry<String, Playable>> set = playlist.entrySet();


		System.out.println("**************** Keys in map.");
		System.out.println(playlist.keySet());		
		System.out.println("**************** Values in map.");
		System.out.println(playlist.values());

		// for (  Entry<String, Playable> entry : playlist.entrySet()) {
		// 	try {
		// 		play(entry.getValue());
		// 	} catch (CodecNotInstalledException e) {
		// 		System.out.println(e.getMessage());
		// 		install(e.getCodec());
		// 	}
		// }			
		

		for (Playable playable : playlist.values()) {
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

	// MAP PUT
	public void addToPlaylist(Playable object) {
		// put(key, value)
		playlist.put(object.getFilename(), object);
	}

	// MAP GET
	public void playMedia(String string) {
		// for(Playable playable: playlist) {
		// if (playable.getFilename().equals(string)) {
		// playable.play();
		// }
		// }
		//
		// get(key) => value
		Playable playable = playlist.get(string);
		playable.play();
	}

	// DO NOT MODIFY THE ABOVE METHOD
	// ADD YOUR CODE BELOW THIS LINE
	// ==============================

}
