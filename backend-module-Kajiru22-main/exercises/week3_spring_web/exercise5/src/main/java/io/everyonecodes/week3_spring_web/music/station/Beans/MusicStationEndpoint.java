package io.everyonecodes.week3_spring_web.music.station.Beans;

import io.everyonecodes.week3_spring_web.music.station.Data_Classes.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class MusicStationEndpoint {


    private MusicStation musicStation;

    public MusicStationEndpoint(MusicStation musicStation) {
        this.musicStation = musicStation;
    }


    @GetMapping
    List<Song> songs() {
        return musicStation.findAll();
    }

    @GetMapping("/electronic")
    List<Song> electronic() {
        return musicStation.findBy("electronic");
    }

    @GetMapping("/psychedelic rock")
    List<Song> psychedelic_rock() {
        return musicStation.findBy("psychedelic rock");
    }

    @GetMapping("/son")
    List<Song> son() {
        return musicStation.findBy("son");
    }
}
