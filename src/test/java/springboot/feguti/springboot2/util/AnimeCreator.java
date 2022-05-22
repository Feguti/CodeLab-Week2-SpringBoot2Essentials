package springboot.feguti.springboot2.util;

import springboot.feguti.springboot2.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Kimetsu no Yaiba")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .name("Kimetsu no Yaiba")
                .id(1l)
                .build();
    }

    public static Anime createValidUpdatedAnime() {
        return Anime.builder()
                .name("Horimiya")
                .id(1l)
                .build();
    }
}
