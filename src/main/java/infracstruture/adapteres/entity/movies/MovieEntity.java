package infracstruture.adapteres.entity.movies;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("movies")
@Data
@Builder
public class MovieEntity {
    @Id
    private int id;
    @Column
    private String titulo;
    @Column
    private String descripcion;
    @Column
    private String duracion;
    @Column
    private int puntuacion;
    @Column
    private int categoriaId;
}
