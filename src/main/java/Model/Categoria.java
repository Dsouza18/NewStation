package Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categoria {

    @Id
    private Long id;

    @Column(name = "nome_categoria", nullable = false)
    private String nomeCategoria;

}

