package com.buscatrampo.buscaTrampo.autonomo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Lincoln
 */
@Table(name = "autonomo")
@Entity(name = "Autonomo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autonomo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String profissao;

    public Autonomo(DadosCadastroAutonomo dados){
        this.email = dados.email();
        this.senha = dados.senha();
        this.nome = dados.nome();
        this.profissao = dados.profissao();
        this.telefone = dados.telefone();
    }
    public void atualizarInformacoes(DadosAtualizadoAutonomo dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.email() != null){
            this.email = dados.email();
        }
        if (dados.senha() != null){
            this.senha = dados.senha();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if (dados.profissao() != null){
            this.profissao = dados.profissao();
        }
    }
}
