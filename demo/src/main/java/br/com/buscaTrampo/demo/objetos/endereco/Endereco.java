package br.com.buscaTrampo.demo.objetos.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Lincoln
 */

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String cep, logradouro, bairro, complemento, numero, uf, cidade;

    public Endereco(DadosEndereco endereco){
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.logradouro = endereco.logradouro();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
        this.uf = endereco.uf();
        this.cidade = endereco.cidade();
    }

}
