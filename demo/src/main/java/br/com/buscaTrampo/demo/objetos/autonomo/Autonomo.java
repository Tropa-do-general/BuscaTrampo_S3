package br.com.buscaTrampo.demo.objetos.autonomo;

import br.com.buscaTrampo.demo.objetos.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;


/**
 * @author Lincoln
 */
@Table(name = "autonomos")
@Entity(name = "Autonomo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autonomo {

    @Id  @GeneratedValue
    private Long id;
    private String nome, email, senha, areaDeTrabalho;

    @Embedded
    private Endereco endereco;

    public Autonomo(DadosCadastroAutonomo autonomo){
        this.email = autonomo.email();
        this.areaDeTrabalho = autonomo.areaDeTrabalho();
        this.nome = autonomo.nome();
        this.senha = autonomo.senha();
        this.endereco = new Endereco(autonomo.endereco());
    }

}
