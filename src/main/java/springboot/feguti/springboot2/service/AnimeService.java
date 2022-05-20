package springboot.feguti.springboot2.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import springboot.feguti.springboot2.domain.Anime;

import java.util.List;

@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1l, "Kimetsu no Yaiba"), new Anime(2l, "FMA Brotherhood"), new Anime(3l, "Horimiya"));

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }
}

