package io.everyonecodes.week3_spring_web.music.station.Beans;

import io.everyonecodes.week3_spring_web.music.station.Data_Classes.Song;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("music")
public class MusicStation {

    private List<Song> songs;

    public List<Song> findAll() {
        return songs;
    }

    public List<Song> findBy(String genre) {
        return songs.stream()
                .filter(song -> song.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
