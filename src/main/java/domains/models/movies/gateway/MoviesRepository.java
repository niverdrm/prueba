package domains.models.movies.gateway;

import domains.models.movies.Movies;
import reactor.core.publisher.Mono;

public interface MoviesRepository {

    Mono<Movies> save(Movies movies);
    Mono<Movies>find(String titulo);

}
