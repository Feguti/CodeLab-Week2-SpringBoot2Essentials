package springboot.feguti.springboot2.repository;

import org.springframework.stereotype.Repository;
import springboot.feguti.springboot2.domain.Anime;
import java.util.List;

@Repository
public interface AnimeRepository {
    List<Anime> listAll();

}
