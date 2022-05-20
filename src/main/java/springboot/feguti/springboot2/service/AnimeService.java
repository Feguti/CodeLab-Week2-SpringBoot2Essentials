package springboot.feguti.springboot2.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import springboot.feguti.springboot2.domain.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(new Anime(1l, "Kimetsu no Yaiba"), new Anime(2l, "FMA Brotherhood"), new Anime(3l, "Horimiya")));
    }
    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(4, 1000000));
        animes.add(anime);
        return anime;
    }
}

