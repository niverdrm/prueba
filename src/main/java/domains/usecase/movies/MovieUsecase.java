package domains.usecase.movies;

import domains.models.movies.Movies;
import domains.models.movies.gateway.MoviesRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MovieUsecase {

    private  final MoviesRepository repository;

    public Mono<Movies> save(Movies movies){
        return repository.save(movies);
    }
}
