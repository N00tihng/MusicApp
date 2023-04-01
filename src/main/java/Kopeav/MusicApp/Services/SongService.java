package Kopeav.MusicApp.Services;

import Kopeav.MusicApp.Models.Song;
import Kopeav.MusicApp.Repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SongService {
    private final SongRepository songRepository;

    public Optional<Song> findSongById(int id) {
        return songRepository.findById(id);
    }
}
