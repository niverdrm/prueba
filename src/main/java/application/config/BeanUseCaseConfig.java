package application.config;

import domains.models.movies.gateway.MoviesRepository;
import domains.usecase.movies.MovieUsecase;
import infracstruture.adapteres.repository.movies.util.CodeBuilderMovies;
import infracstruture.entrypoints.util.CodeBuiderMovies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanUseCaseConfig {
//
//    @Bean
//    public MovieUsecase builMoviesUseCase(MoviesRepository repository){
//        return  new MovieUsecase(repository);
//    }

    @Bean
    public CodeBuilderMovies codeBuilderMovies(){
        return  new CodeBuilderMovies();
    }

    @Bean
    public CodeBuiderMovies codeBuilderM(){
        return  new CodeBuiderMovies();
    }
}
