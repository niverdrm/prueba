package domains.models.movies;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
@Data
@Builder
public class Movies {

    private int id;

    private String titulo;

    private String descripcion;

    private String duracion;
    private int puntuacion;
    private int categoriaId;
}
