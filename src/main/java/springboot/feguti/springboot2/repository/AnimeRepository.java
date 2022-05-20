package springboot.feguti.springboot2.repository;

import springboot.feguti.springboot2.domain.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();

}
