package Task_05_RadioDatabase;

/**
 * Created by iv.ivanov on 2/14/2017.
 */
public class OnlineRadioDatabase {
    private String artistName;
    private String songName;
    private Integer minutes;
    private Integer seconds;

    public OnlineRadioDatabase(String artistName, String songName, Integer minutes, Integer seconds) {
        try {
            this.setArtistName(artistName);
        } catch (InvalidArtistNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setSongName(songName);
        } catch (InvalidSongException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setMinutes(minutes);
        } catch (InvalidSongLengthException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setSeconds(seconds);
        } catch (InvalidSongLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setSeconds(Integer seconds) throws InvalidSongLengthException {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongLengthException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    private void setMinutes(Integer minutes) throws InvalidSongLengthException {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongLengthException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    private void setSongName(String songName) throws InvalidSongException {
        if (songName.length() < 3 || songName.length() > 20) {
            throw new InvalidSongException("Song name should be between 3 and 20 symbols.");
        }
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }
}
