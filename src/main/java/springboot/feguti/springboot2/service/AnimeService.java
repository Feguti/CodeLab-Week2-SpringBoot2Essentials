package springboot.feguti.springboot2.service;

import org.springframework.stereotype.Service;
import springboot.feguti.springboot2.domain.Anime;

import java.util.List;

@Service
public class AnimeService {
    public static List<Anime> listAll(){
        return List.of(new Anime(1, "Kimetsu no Yaiba"), new Anime(2, "FMA Brotherhood"));
    }
}
