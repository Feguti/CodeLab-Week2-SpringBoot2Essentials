package springboot.feguti.springboot2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import springboot.feguti.springboot2.domain.Anime;
import springboot.feguti.springboot2.requests.AnimePostRequestBody;
import springboot.feguti.springboot2.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePostRequestBody);


}
