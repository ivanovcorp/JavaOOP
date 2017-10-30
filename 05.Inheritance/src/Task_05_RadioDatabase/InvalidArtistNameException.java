package Task_05_RadioDatabase;

/**
 * Created by ivano on 2/14/2017.
 */
public class InvalidArtistNameException extends InvalidSongException {
    private String message;


    public InvalidArtistNameException(String message) {
        super(message);
    }
}
