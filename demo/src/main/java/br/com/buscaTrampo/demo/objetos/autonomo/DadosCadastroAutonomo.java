package br.com.buscaTrampo.demo.objetos.autonomo;

import br.com.buscaTrampo.demo.objetos.endereco.DadosEndereco;
import br.com.buscaTrampo.demo.objetos.endereco.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * @author Lincoln
 */
public record DadosCadastroAutonomo(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
        String senha,
        @NotBlank
        String areaDeTrabalho,
        @NotNull
        DadosEndereco endereco
) {
}
