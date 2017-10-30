package Task_05_RadioDatabase;

/**
 * Created by ivano on 2/14/2017.
 */
public class InvalidSongException extends Exception {
    private String message;

    public InvalidSongException(String message) {
        this.message = message;
    }
}
