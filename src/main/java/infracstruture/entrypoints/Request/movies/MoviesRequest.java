package infracstruture.entrypoints.Request.movies;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@Builder
public class MoviesRequest {


    @NotNull(message = "Este campo no puede ser vacio titulo")
    private String titulo;
    @NotNull(message = "Este campo no puede ser vacio descripcion")
    private String descripcion;
    @NotNull(message = "Este campo no puede ser vacio duracion")
    private String duracion;
    @NotNull(message = "Este campo no puede ser vacio puntuacion")
    @Min(value = 1)
    @Max(value = 5)
    private int puntuacion;
    @NotNull(message = "Este campo no puede ser vacio categoriaId")
    private int categoriaId;

}
