package infracstruture.adapteres.repository.movies;

import domains.models.movies.Movies;
import domains.models.movies.gateway.MoviesRepository;
import infracstruture.adapteres.repository.movies.util.CodeBuilderMovies;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MovieAdapter implements MoviesRepository {

    private final MoviesEntityRepositoty repositoty;
    private final CodeBuilderMovies codeBuilderMovies;
    @Override
    public Mono<Movies> save(Movies movies) {
        return repositoty.save(codeBuilderMovies.toModerlEntity(movies))
                .map(codeBuilderMovies::toEntityModel)
                .onErrorMap(Exception.class, e -> new Exception(e));
    }

    @Override
    public Mono<Movies> find(String titulo) {
        return null;
    }
}
