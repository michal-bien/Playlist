public class Song extends Tracks{

    private String author;

    public Song(String title, String format, String length, String author){
        super(title, format, length);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song: " + author+" - "+title;
    }
}
