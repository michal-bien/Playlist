public class Movie extends Tracks{
    private String category;
    private String director;

    public Movie(String title, String format, String length, String category, String director){
        super(title, format, length);
        this.category = category;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie: "+ title + " - " + director + " - " + category;
    }
}
