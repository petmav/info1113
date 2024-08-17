import java.util.*;

// implements comparable to allow for sorting
public class Song implements Comparable<Song> {
    
    private String title;
    private String author;
    private double duration;

    public Song(String title, String author, double duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getDuration() {
        return duration;
    }

    // sort by title
    @Override
    public int compareTo(Song s) {
        return this.title.compareTo(s.title);
    }

    @Override
    public String toString() {
        return author + " - " + title + " (" + duration + ")";
    }

    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Hello", "Boop", 4.5));
        songs.add(new Song("Rolling in the Deep", "Charlie XCX", 3.5));
        songs.add(new Song("Someone Like You", "Adele", 4.0));

        // Regular sort

        // Collections.sort(songs);
        // for (Song s : songs) {
        //     System.out.println(s.getTitle());
        // }

        // Sort by author through a comparator (anonymous inner class)

        // Collections.sort(songs, new Comparator<T>()) {
        //     @Override
        //     public int compare(Song s1, Song s2) {
        //         return s1.getAuthor().compareTo(s2.getAuthor()); // Sort by author through a comparator
        //     }
        // });

        // Sort by author through a lambda expression

        // Collections.sort(songs, (x, y) -> x.getAuthor().compareTo(y.getAuthor()));

        System.out.println(songs);
        }    
    }
