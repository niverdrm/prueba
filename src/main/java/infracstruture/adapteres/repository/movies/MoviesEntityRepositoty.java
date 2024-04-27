package infracstruture.adapteres.repository.movies;

import infracstruture.adapteres.entity.movies.MovieEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesEntityRepositoty extends ReactiveCrudRepository<MovieEntity, Integer> {

}
