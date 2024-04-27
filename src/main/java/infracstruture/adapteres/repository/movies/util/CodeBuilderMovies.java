package infracstruture.adapteres.repository.movies.util;

import domains.models.movies.Movies;
import infracstruture.adapteres.entity.movies.MovieEntity;

public class CodeBuilderMovies {

    public MovieEntity toModerlEntity(Movies movies){
        return MovieEntity.builder()
                .categoriaId(movies.getCategoriaId())
                .descripcion(movies.getDescripcion())
                .titulo(movies.getTitulo())
                .duracion(movies.getDuracion())
                .puntuacion(movies.getPuntuacion())
                .build();

    }
    public Movies toEntityModel(MovieEntity movies){
        return Movies.builder()
                .categoriaId(movies.getCategoriaId())
                .descripcion(movies.getDescripcion())
                .titulo(movies.getTitulo())
                .duracion(movies.getDuracion())
                .puntuacion(movies.getPuntuacion())
                .build();

    }
}
