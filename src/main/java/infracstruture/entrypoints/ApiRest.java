package infracstruture.entrypoints;

import domains.usecase.movies.MovieUsecase;
import infracstruture.entrypoints.Request.movies.MoviesRequest;
import infracstruture.entrypoints.dto.Dto;
import infracstruture.entrypoints.util.CodeBuiderMovies;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(value= "api/")
@AllArgsConstructor
public class ApiRest {

    private  final MovieUsecase movieUsecase;
    private final CodeBuiderMovies codeBuiderMovies;

    @PostMapping("/save-movies")
    public Mono<ResponseEntity<Dto>> saveMovies(@Valid @RequestBody MoviesRequest movies){
        return  movieUsecase.save(codeBuiderMovies.toModel(movies))
                .map(res -> ResponseEntity.ok()
                        .body(Dto.buildSuccess("Pelicual Registrada",res)));

    }

}
