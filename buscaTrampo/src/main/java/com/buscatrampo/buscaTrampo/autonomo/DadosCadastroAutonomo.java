package com.buscatrampo.buscaTrampo.autonomo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * @author Lincoln
 */
public record DadosCadastroAutonomo(
   @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,
    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{4,}$")
    String senha,
    @NotBlank
    String profissao,
    @NotBlank
    String telefone

) {

}
