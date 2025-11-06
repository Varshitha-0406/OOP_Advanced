package SortingandStreamAPI;
import java.util.*;
import java.util.stream.*;

class Song {
    String title;
    String artist;
    double duration;

    Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String toString() {
        return title + " by " + artist + " (" + duration + " mins)";
    }
}

public class MusicStreaming {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
            new Song("Summertime Sadness", "Lana Del Rey", 4.2),
            new Song("Doin’ Time", "Lana Del Rey", 3.1),
            new Song("Perfect","Ed.sheeran",4.4),
            new Song("Levitating", "Dua Lipa", 2.9),
            new Song("Blinding Lights", "The Weeknd", 3.5),
            new Song("West Coast", "Lana Del Rey", 4.1)
        );

        List<String> longSongs = songs.stream()
                .filter(song -> song.duration > 3.0)   
                .map(song -> song.title)               
                .collect(Collectors.toList());      

        System.out.println("Songs longer than 3 minutes:");
        longSongs.forEach(System.out::println);
    }
}
