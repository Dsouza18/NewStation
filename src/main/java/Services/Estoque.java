package Services;

import Model.Produto;

import javax.persistence.Entity;

@Entity
public class Estoque {

    private Integer quantidade;
    private Produto produto;

}
