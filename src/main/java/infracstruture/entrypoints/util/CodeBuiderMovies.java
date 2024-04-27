package infracstruture.entrypoints.util;

import domains.models.movies.Movies;
import infracstruture.entrypoints.Request.movies.MoviesRequest;

public class CodeBuiderMovies {

    public Movies toModel(MoviesRequest movies){
        return Movies.builder()
                .categoriaId(movies.getCategoriaId())
                .descripcion(movies.getDescripcion())
                .titulo(movies.getTitulo())
                .duracion(movies.getDuracion())
                .puntuacion(movies.getPuntuacion())
                .build();

    }
}
