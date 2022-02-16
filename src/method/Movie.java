package method;

public class Movie {
    private String title, director, actors;

    public void setTitle(String t) {
        title = t;
        System.out.println(t);
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String d) {
        director = d;
    }

    public String getDirector() {
        return director;
    }

    public void setActors(String a) {
        actors = a;
    }

    public String getActors() {
        return actors;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Transformer");
        System.out.println(movie);

    }
}
