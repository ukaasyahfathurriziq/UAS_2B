public class Film {
    private String id;
    private String title;
    private int year;
    private double rating;

    public Film(String id, String title, int year, double rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Year: " + year + "\n" +
                "Rating: " + rating + "\n";
    }
}
