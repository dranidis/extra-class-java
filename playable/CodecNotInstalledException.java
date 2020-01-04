package playable;

public class CodecNotInstalledException extends Exception {

    private String codec;

	public CodecNotInstalledException(String codec) {
        super("Cannot play file. Codec: " + codec +  " is not installed");
        this.codec = codec;
    }
    
    // @Override
    // public String getMessage() {
    //     return "Cannot play file. Codec: " + codec +  " is not installed";
    // }

	public String getCodec() {
		return codec;
	}
}
